package streams;

import java.util.OptionalDouble;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.DoubleStream;

/**
 * Map-Reduction
 * 
 * Given an array of double values, construct a stream-pipeline that return sum
 * of elements.
 * 
 * @author soufrk
 */
public class Streams002 {

    public static void main(String... args) {
        DoubleBinaryOperator sumOperator = new DoubleBinaryOperator() {
            
			@Override
			public double applyAsDouble(double left, double right) {
				//System.out.println("Left=" + left);
				//System.out.println("Right=" + right);
				double sum = right + left;
				return sum;
			}
        };
       
        double[] values = {1.00, 2.00, 3.00, 4.00};
        //double[] values = {}; // What will be the output, if an empty array is passed ?
        
        // 1. Counting number of elements in stream
        long count = DoubleStream.of(values)
                .map(v->v)
                .count();
        System.out.println(count);
        
        // 2. Adding elements using sum()
        double result = DoubleStream.of(values)
                .map(v->v)
                .sum();
        System.out.println(result);
        
        // 3. Using explicit reduce method
        OptionalDouble sum = DoubleStream.of(values)
        		.reduce(sumOperator);
        if(sum.isPresent()) {
        	System.out.println(sum.getAsDouble());
        }
        // 3.1 Alternate way of using Optional
        sum.ifPresent(System.out::println);
        
        // 4. Using identity reduce
        double sum2 = DoubleStream.of(values)
        		//.reduce(0.0, (v1, v2)-> v1+v2);
        		.reduce(0.0, sumOperator);
        System.out.println(sum2);
    }
}

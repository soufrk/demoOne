package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Typed Stream Vs Primitive Stream
 * Predict the output !!
 * @author soufrk
 */
public class Streams001 {

    public static void main(String... args) {
        double[] values = {1.00, 2.00, 3.00, 4.00};
        int[] numbers = {12, 13};
        List<Double> listOfDouble = Arrays.asList(1.00, 2.00, 3.00, 4.00); 
        countElementInsTream(Stream.of(values));
        countElementInsTream(Arrays.stream(values));
        countElementInsTream(Arrays.stream(numbers));
        countElementInsTream(Stream.of(listOfDouble));
        countElementInsTream(listOfDouble.stream());
    }
    
    private static void countElementInsTream(Stream<?> stream) {
    	long result = stream
    			.peek(e->System.out.println(e))
                .count();
    	System.out.println(result);
    }
}

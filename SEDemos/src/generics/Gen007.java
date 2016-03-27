package generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Bounded wildcard.
 * 
 * Earlier we saw that wildcard accepts any Class. Wildcards can be
 * restricted for to a specific hierarchy, combinations of hierarchies.
 * 
 * Restriction on hierarchy of parent is called - Upper Bound
 * Restriction on hierarchy of childs is called - Lower Bound
 * 
 * Let's see Upper Bounded first, where the the type of Parameter
 * is bounded to any subclass of a given class.
 * 
 * @author soufrk
 *
 */
public class Gen007 {

	public static void main(String[] args) {
		
		MyUpperBounded<Integer> number1 = new MyUpperBounded<>();
		number1.printValue(10);
		
		MyUpperBounded<Long> number2 = new MyUpperBounded<>();
		number2.printValue(120L);
		
		MyUpperBounded<Double> number3 = new MyUpperBounded();
		number3.printValue(0.1254D);
		
		// We canot use MyNumber with any onther type
		//MyNumber007<String> number4 = new MyNumber007();
		
		// The following List can point to any of,
		// List<Integer>, List<Double>, List<Long>
		List<? extends Number> listOfNumbers = new LinkedList<Integer>();
		listOfNumbers = new LinkedList<Long>();
		listOfNumbers = new LinkedList<Double>();
		// But, that's not possible 
		//listOfNumbers = new LinkedList<String>();
		
		// What about
		// listOfNumbers.add(10);
		// listOfNumbers.add(20L);
		// listOfNumbers.add(30.1);
		
	}

}

/* MyNmber is Generalised for operation with any
 * child of Number class.
 */
class MyUpperBounded<T extends Number>{
	public void printValue(T t){
		System.out.println(t.toString());
	}
}
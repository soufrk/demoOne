package generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Bounded wildcard.
 * 
 * Earlier we saw that wildcard accepts any Class. Wildcards can be restricted
 * for to a specific hierarchy, combinations of hierarchies.
 * 
 * Restriction on hierarchy of parent is called - Upper Bound Restriction on
 * hierarchy of childs is called - Lower Bound
 * 
 * Let's see Upper Bounded first, where the the type of Parameter is bounded to
 * any subclass of a given class.
 * 
 * @author soufrk
 *
 */
public class WildcardUpperBound {

    public static void main(String[] args) {

	MyNumber<Integer> number1 = new MyNumber<>();
	number1.printValue(10);

	MyNumber<Long> number2 = new MyNumber<>();
	number2.printValue(120L);

	MyNumber<Double> number3 = new MyNumber();
	number3.printValue(0.1254D);

	// We cannot use MyNumber with any other type
	MyNumber<String> number4 = new MyNumber();

	// The following List can point to any of,
	List<? extends Number> listOfNumbers = new LinkedList<Integer>();
	listOfNumbers = new LinkedList<Long>();
	listOfNumbers = new LinkedList<Double>();

	// But, that's not possible
	listOfNumbers = new LinkedList<String>();

	// What about
	listOfNumbers.add(10);
	listOfNumbers.add(20L);
	listOfNumbers.add(30.1);
    }

}

/*
 * MyNumber is generalised for operation with any child of Number class.
 */
class MyNumber<T extends Number> {
    public void printValue(T t) {
	System.out.println(t.toString());
    }
}
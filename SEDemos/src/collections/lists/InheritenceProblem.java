package collections.lists;

import java.util.LinkedList;
import java.util.List;

/**
 * Should be easy to guess the outcome.
 * 
 * @author soufrk
 *
 */
public class InheritenceProblem {

    public static void main(String[] args) {
	List<Number> listOfNumbers = new LinkedList<>();
	listOfNumbers.add(1);
	listOfNumbers.add(1.1);
	List<Integer> listOfIntegers = new LinkedList<>();
	listOfIntegers.add(2);
	System.out.println(listOfNumbers.addAll(listOfIntegers));
	System.out.println(listOfIntegers.addAll(listOfNumbers));
    }

}

package collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * The question is not if the code compiles or gives output.
 * The code generates a ClassCastException.
 * 
 * The question is what will be printed as Exception message.
 * @author soufrk
 *
 */
public class RawTreeSet {

	public static void main(String[] args) {
		Set mySet = new TreeSet();
		
		// Case 1
		mySet.add(1);
		mySet.add("C");
		
		// Case 2
		mySet.add("C");
		mySet.add("B");
		mySet.add(1);
	}

}

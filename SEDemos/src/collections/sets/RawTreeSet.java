package collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * The question is not if the code compiles or gives output. 
 * Given that the code generates a ClassCastException,
 * 
 * what will be printed as exception-message ?
 * 
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

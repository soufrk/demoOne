package collections.sets;

import java.util.Arrays;
import java.util.TreeSet;

public class NavigableSetMethods {

    public static void main(String[] args) {
	TreeSet<Integer> mySet = new TreeSet<>();
	mySet.addAll(Arrays.asList(1, 3, 5, 12, 15, 19, 21));
	// Higher or equal value
	System.out.println(mySet.ceiling(12));
	// Strictly next higher value
	System.out.println(mySet.higher(12));
	// Lower or equal value
	System.out.println(mySet.floor(12));
	// Strictly next lower value
	System.out.println(mySet.lower(12));
	// Remove first element (higher/lower is the question)
	System.out.println(mySet.pollFirst());
	// Remove last element (higher/lower is the question)
	System.out.println(mySet.pollLast());
	// Descending Set
	System.out.println(mySet.descendingSet());
    }

}

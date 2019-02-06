package collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * SortedSet behaviour illustration.
 * 
 * @author soufrk
 *
 */
public class SortedSet {

    /**
     * What do you think happens over here ?
     * 
     * @param args
     */
    public static void main1(String[] args) {
	Set<String> mySet = new TreeSet<>();
	mySet.add("A");
	mySet.add("B");
	mySet.add("C");
	mySet.add("D");
	mySet.add("E");
	mySet.add("F");
	System.out.println(mySet.subSet("B", "D"));
    }

    /**
     * First behaviour - subSet() from - inclusive to - exclusive
     * 
     * @param args
     */
    public static void main2(String[] args) {
	TreeSet<String> mySet = new TreeSet<>();
	mySet.add("A");
	mySet.add("B");
	mySet.add("C");
	mySet.add("D");
	mySet.add("E");
	mySet.add("F");
	// (from, to) - present in set.
	System.out.println(mySet.subSet("B", "D"));
	// (from, to) - present in set.
	System.out.println(mySet.subSet("D", "F"));
	// (from = to) - last element in set.
	System.out.println(mySet.subSet("F", "F"));
	// (from = to) - first element in set.
	System.out.println(mySet.subSet("A", "A"));
	// (from, to) - to not present in set.
	System.out.println(mySet.subSet("A", "G"));
	// (from, to) - from not present in state > to present in state.
	System.out.println(mySet.subSet("G", "A"));
	// (from, to) - both not present in set.
	System.out.println(mySet.subSet("M", "N"));
    }

    /**
     * Second behaviour - headSet(high)
     * 
     * @param args
     */
    public static void main3(String[] args) {
	TreeSet<String> mySet = new TreeSet<>();
	mySet.add("B");
	mySet.add("C");
	mySet.add("D");
	mySet.add("E");
	mySet.add("F");
	mySet.add("G");
	// high - present in set.
	System.out.println(mySet.headSet("D"));
	// high - lowest element in set.
	System.out.println(mySet.headSet("B"));
	// high - highest element in set.
	System.out.println(mySet.headSet("G"));
	// high - less than lowest element in set.
	System.out.println(mySet.headSet("A"));
	// high - greater than highest element in set.
	System.out.println(mySet.headSet("H"));
    }

    /**
     * Third behaviour - tailSet(low)
     * 
     * @param args
     */
    public static void main4(String[] args) {
	TreeSet<String> mySet = new TreeSet<>();
	mySet.add("B");
	mySet.add("C");
	mySet.add("D");
	mySet.add("E");
	mySet.add("F");
	mySet.add("G");
	// low - present in set.
	System.out.println(mySet.tailSet("D"));
	// low - lowest element in set.
	System.out.println(mySet.tailSet("B"));
	// low - highest element in set.
	System.out.println(mySet.tailSet("G"));
	// low - less than lowest element in set.
	System.out.println(mySet.tailSet("A"));
	// low - greater than highest element in set.
	System.out.println(mySet.tailSet("H"));
    }

    /*
     * headSet() is always exclusive, whereas tailSet() is always inclusive.
     */

    /**
     * first() & last()
     * 
     * @param args
     */
    public static void main5(String[] args) {
	TreeSet<String> mySet = new TreeSet<>();
	mySet.add("B");
	mySet.add("C");
	mySet.add("D");
	mySet.add("E");
	mySet.add("F");
	mySet.add("G");

	System.out.println(mySet.first());
	System.out.println(mySet.last());
    }

}

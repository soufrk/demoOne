package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Given that some lines compile, some don't.
 * Separate the two.
 * 
 * @author soufrk
 *
 */
public class UpperBoundGenericProblem {

    public static void main(String[] args) {
	List<Number> myList1 = new LinkedList<>();
	List<? extends Number> myList2 = new LinkedList<>();
	myList1.add(1);
	myList1.add(2L);
	myList1.add(0.2154d);
	myList1.add(0.5148f);
	myList1.add(0xAF);
	myList1.add(0b001011);
	myList1.add("1.732f");
	
	myList2.add(1);
	myList2.add(2L);
	myList2.add(0.2154d);
	myList2.add(0.5148f);
	myList2.add(0xAF);
	myList2.add(0b001011);
	myList2.add("1.732f");
    }

}

package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Type Erasure - when we generalize a generic from a specific
 * type.
 * @author soufrk
 *
 */
public class Gen005 {

	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<>();
		List erasedList = myList;
		//myList.add("A");
		
	}

}

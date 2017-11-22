package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * What happens when we generalize a generic from a specific type.
 * 
 * @author soufrk
 *
 */
public class TypeErasure {

    public static void main(String[] args) {
	List<Integer> myList = new LinkedList<>();
	List erasedList = myList;
	myList.add("A");
    }

}

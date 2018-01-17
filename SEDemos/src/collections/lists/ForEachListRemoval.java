package collections.lists;

import java.util.LinkedList;
import java.util.List;

/**
 * Why removal of a collection element using a for-each should never be done.
 * 
 * for-each should only be limited to - traversal. 
 * if, traversal and removal is required - use Iterator.
 * 
 * @author soufrk
 *
 */
public class ForEachListRemoval {

    public static void main(String[] args) {
	List<String> myList = new LinkedList<>();
	myList.add("A");
	myList.add("B");
	myList.add("C");

	for (String tmp : myList) {
	    System.out.println(tmp);
	    myList.remove(tmp);
	}
	System.out.println(myList);
    }

}

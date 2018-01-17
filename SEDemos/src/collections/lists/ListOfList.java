package collections.lists;

import java.util.LinkedList;
import java.util.List;

/**
 * One of these doesn't compile. Guess which one.
 * 
 * @author soufrk
 *
 */
public class ListOfList {

    public static void main(String[] args) {
	List<List<String>> myList1 = new LinkedList<>();
	List<List<String>> myList2 = new LinkedList<List<String>>();
	List<List<String>> myList3 = new LinkedList<LinkedList<String>>();
    }

}

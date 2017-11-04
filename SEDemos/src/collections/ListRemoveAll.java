package collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Behaviour of removeAll method in a list.
 * @author soufrk
 *
 */
public class ListRemoveAll {

    public static void main1(String[] args) {
	List<String> listA = new LinkedList<>();
	List<String> listB = new LinkedList<>();
	
	listA.add("A");listA.add("B");listA.add("C");listA.add("A");
	listB.add("A");
	
	listA.removeAll(listB);
	System.out.println(listA);
    }
    
    public static void main(String[] args) {
	List<String> listA = new LinkedList<>();
	List<String> listB = new LinkedList<>();
	
	listA.add("A");listA.add("B");listA.add("C");listA.add("A");
	listB.add("A");listB.add("D");
	
	listA.removeAll(listB);
	System.out.println(listA);
    }

}

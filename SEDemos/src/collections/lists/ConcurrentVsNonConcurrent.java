package collections.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Demonstrates removal from concurrent collection while using an Iterator, in
 * contrast to a non-concurrent collection.
 * 
 * @author soufrk
 *
 */
public class ConcurrentVsNonConcurrent {

    public static void main1(String[] args) {
	List<String> myList = new CopyOnWriteArrayList<>();
	myList.add("A");
	myList.add("B");
	Iterator<String> myItr = myList.iterator();
	System.out.println("Removing first element: " + myList.remove(0));
	//myList.remove(0);
	System.out.println("Printing list: " + myList);
	System.out.println("Removing first element: " + myList.remove(0));
	//myList.remove(0);
	System.out.println("Check for next element in Iterator:" + myItr.hasNext());
	System.out.println("Print next element using Iterator:" + myItr.next());
	System.out.println("Print next element using Iterator:" + myItr.next());
	System.out.println("Printing list: " + myList);
    }
    
    public static void main2(String[] args) {
	List<String> myList = new LinkedList<>();
	myList.add("A");
	myList.add("B");
	Iterator<String> myItr = myList.iterator();
	System.out.println("Removing first element: " + myList.remove(0));
	//myList.remove(0);
	System.out.println("Printing list: " + myList);
	System.out.println("Removing first element: " + myList.remove(0));
	//myList.remove(0);
	System.out.println("Check for next element in Iterator:" + myItr.hasNext());
	System.out.println("Print next element using Iterator:" + myItr.next());
	System.out.println("Print next element using Iterator:" + myItr.next());
	System.out.println("Printing list: " + myList);
    }

}

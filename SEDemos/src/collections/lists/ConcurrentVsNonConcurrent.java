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
	// Using any one of the below,
	List<String> myList = new CopyOnWriteArrayList<>();

	myList.add("A");
	myList.add("B");

	Iterator<String> myItr = myList.iterator();
	myList.remove(0);
	System.out.println(myList);
	myList.remove(0);
	System.out.println(myItr.hasNext());
	System.out.println(myItr.next());

	System.out.println(myItr.next());
	System.out.println(myList);
    }
    
    public static void main2(String[] args) {
	// Using any one of the below,
	List<String> myList = new LinkedList<>();

	myList.add("A");
	myList.add("B");

	Iterator<String> myItr = myList.iterator();
	myList.remove(0);
	System.out.println(myList);
	myList.remove(0);
	System.out.println(myItr.hasNext());
	System.out.println(myItr.next());

	System.out.println(myItr.next());
	System.out.println(myList);
    }

}

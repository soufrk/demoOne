package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Demonstrates removal from concurrent collection while
 * using an Iterator, in contrast to a non-concurrent
 * collection.
 * @author soufrk
 *
 */
public class ConcurrentCollectionDemo {

	public static void main(String[] args) {
		List<String> myList = new CopyOnWriteArrayList<>();
		//List<String> myList = new LinkedList<>();
	
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

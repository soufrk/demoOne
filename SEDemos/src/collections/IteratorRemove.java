package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorRemove {

	/**
	 * If a collection is modified(removal) while
	 * iterating through an Iterator, removal is
	 * reflected in actual collection as well.
	 */
	/*public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		Iterator<String> myItr = myList.iterator();
		myItr.next();
		myItr.remove();
		System.out.println(myList);
		System.out.println(myItr.hasNext());
	}*/
	
	/**
	 * However, if a collection is modified outside while
	 * an Iterator is working, it results in 
	 * <tt>ConcurrentModificationException</tt>
	 * @param args
	 */
	/*public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		Iterator<String> myItr = myList.iterator();
		myList.remove("A");
		System.out.println(myItr.next());
	}*/
	
	/**
	 * Iterator will remove the last element it had returned.
	 * Hence, the following throws Exception.
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		Iterator<String> myItr = myList.iterator();
		myItr.remove();
	}
	
	/**
	 * But, surprisingly <tt>hasNext()</tt> can be invoked
	 * without <tt>ConcurrentModificationException</tt>.
	 * It is only when <tt>next()</tt> is invoked to a 
	 * modified list, <tt>ConcurrentModificationException</tt>
	 * is thrown. 
	 * @param args
	 */
	/*public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		Iterator<String> myItr = myList.iterator();
		myList.remove("A");
		System.out.println(myItr.hasNext());
		System.out.println(myItr.next());
	}*/

}

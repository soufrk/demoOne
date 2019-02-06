package collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Basic functions around a queue.
 * 
 * @author soufrk
 *
 */
public class QueueBasicOperations {

    public static void main1(String[] args) {
	Queue<String> q = new LinkedList<>();
	// 1. Add just like list.
	System.out.println("Added element:" + q.add("A") + ", And the Q:" + q);
	// 2. Remove an element.
	System.out.println("Last element:" + q.remove() + ", And the Q:" + q);
	// 3. Removing element from empty queue throws an exception(guess which one ?)
	q.remove();
    }
    
    // But is the same valid with an array-list ?
    /*public static void main2(String[] args) {
	Queue<String> q = new ArrayList<>();
	// 1. Add just like list.
	System.out.println("Added element:" + q.add("A") + ", And the Q:" + q);
	// 2. Remove an element.
	System.out.println("Last element:" + q.remove() + ", And the Q:" + q);
	// 3. Removing element from empty Q throws an exception.
	q.remove();
    }*/
    
    public static void main(String[] args) {
	Queue<String> q = new LinkedList<>();
	// 1. Add just like list.
	q.add("A");q.add("B");
	// 2.  Get the head of queue.
	System.out.println("Head element:" + q.element() + ", And the Q:" + q);
	// 3. Removing all elements.
	q.remove();q.remove();
	// 4. Get head of empty queue throws an Exception(guess which one ?).
	System.out.println("Head element:" + q.element() + ", And the Q:" + q);
    }
    
}

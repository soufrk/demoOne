package collections;

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
	// 3. Removing element from empty Q throws an exception.
	q.remove();
    }
    
    // But is the same valid with an array-list ?
    public static void main(String[] args) {
	Queue<String> q = new ArrayList<>();
	// 1. Add just like list.
	System.out.println("Added element:" + q.add("A") + ", And the Q:" + q);
	// 2. Remove an element.
	System.out.println("Last element:" + q.remove() + ", And the Q:" + q);
	// 3. Removing element from empty Q throws an exception.
	q.remove();
    }
    
}

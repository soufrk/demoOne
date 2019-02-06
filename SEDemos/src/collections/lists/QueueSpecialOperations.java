package collections.lists;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Special operations of the Queue class.
 * 
 * @author soufrk
 *
 */
public class QueueSpecialOperations {

    public static void main1(String[] args) {
	Queue<String> q = new LinkedList<>();
	q.add("A");
	// 1. Remove an element.
	System.out.println("Removed element:" + q.poll() + ", And the Q:" + q);
	// 2. Show the last element inserted.
	System.out.println("Last element:" + q.peek() + ", And the Q:" + q);
    }
    
    public static void main2(String[] args) {
	Queue<String> q = new LinkedList<>();
	// 1. Remove an element from empty Q.
	System.out.println("Removed element:" + q.poll() + ", And the Q:" + q);
	// 2. Show the last element in empty Q.
	System.out.println("Last element:" + q.peek() + ", And the Q:" + q);
    }
    
    public static void main(String[] args) {
	Queue<String> q = new ArrayDeque<>(1);
	System.out.println("Last element:" + q.offer("A") + ", And the Q:" + q);
	System.out.println("Last element:" + q.offer("B") + ", And the Q:" + q);
	System.out.println("Last element:" + q.offer(null) + ", And the Q:" + q);
    }

}

package collections;

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
    
    public static void main3(String[] args) {
	Queue<String> q = new LinkedList<>();
	System.out.println("Last element:" + q.offer(null) + ", And the Q:" + q);
    }

}

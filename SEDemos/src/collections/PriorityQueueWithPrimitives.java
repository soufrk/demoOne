package collections;

import java.util.PriorityQueue;

/**
 * Usage demonstration of PriorityQueue
 * 
 * @author soufrk
 *
 */
public class PriorityQueueWithPrimitives {

    /**
     * Simple example with Integer type.
     */
    public static void main1(String[] args) {
	PriorityQueue<Integer> myQ = new PriorityQueue<>();
	myQ.add(8);
	myQ.add(1);
	myQ.add(5);
	myQ.add(3);
	myQ.add(9);
	System.out.println(myQ);
    }
    
    /**
     * So guess the output with String type.
     */
    public static void main2(String[] args) {
	PriorityQueue<String> myQ = new PriorityQueue<>();
	myQ.add("A");
	myQ.add("M");
	myQ.add("D");
	myQ.add("U");
	myQ.add("K");
	System.out.println(myQ);
    }
    
    /**
     * Let's try another way. Shall we !!
     */
    public static void main3(String[] args) {
	PriorityQueue<String> myQ = new PriorityQueue<>();
	myQ.add("A");
	myQ.add("M");
	myQ.add("D");
	myQ.add("U");
	myQ.add("K");
	while(!myQ.isEmpty())
	    System.out.println(myQ.poll());
	// Bottomline, toString() is not a reflection of
	// the actual behaviour of the Q.
    }
    
    /**
     * Back to Integers again. Guess the output !!
     */
    public static void main4(String[] args) {
	PriorityQueue<Integer> myQ = new PriorityQueue<>();
	myQ.add(8);
	myQ.add(1);
	myQ.add(5);
	myQ.add(3);
	myQ.add(9);
	myQ.add(1);
	System.out.println(myQ);
	/* But, this was working contrary to what we saw in 1st 
	 * example.
	 */ 
    }
    
    /**
     * Let's rework the example
     * @param args
     */
    public static void main5(String[] args) {
	PriorityQueue<Integer> myQ = new PriorityQueue<>();
	myQ.add(8);
	myQ.add(1);
	myQ.add(5);
	myQ.add(3);
	myQ.add(9);
	myQ.add(1);
	while(!myQ.isEmpty())
	    System.out.println(myQ.poll());
    }
    // Seems good !!
    
    /**
     * What if there are multiple elements of same value.
     * @param args
     */
    public static void main6(String[] args) {
	PriorityQueue<Integer> myQ = new PriorityQueue<>();
	myQ.add(8);
	myQ.add(1);
	myQ.add(5);
	myQ.add(3);
	myQ.add(9);
	myQ.add(5);
	myQ.add(7);
	while(!myQ.isEmpty())
	    System.out.println(myQ.poll());
    }
    // Seems good !!
    
    /**
     * Back to String again
     */
    public static void main(String[] args) {
	PriorityQueue<String> myQ = new PriorityQueue<>();
	myQ.add("A");
	myQ.add("a");
	myQ.add("B");
	myQ.add("b");
	while(!myQ.isEmpty())
	    System.out.println(myQ.poll());
	// Bottomline, toString() is not a reflection of
	// the actual behaviour of the Q.
    }

}

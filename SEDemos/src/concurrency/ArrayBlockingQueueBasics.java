package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Basic use,syntax,error,exception using ArrayBlockingQueue. Some of these
 * compile, some don't and some throw exception.
 * 
 * @author soufrk
 *
 */
public class ArrayBlockingQueueBasics {

    // 1. Put an element in an empty queue.
    public static void main1(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(0);
	queue.put(1);
    }

    // 2. Put in a queue of size 1.
    public static void main2(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
	queue.put(1);
    }

    // 3. Put guarding an exception.
    public static void main3(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(0);
	try {
	    queue.put(1);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    // 4. Put two elements in queue with size 1.
    public static void main4(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
	try {
	    queue.put(1);
	    queue.put(2);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    // 5. Using offer in place of put().
    public static void main5(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
	try {
	    queue.offer(1);
	    queue.offer(2);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    // 6. Offer without a without a try/catch block.
    public static void main6(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
	queue.offer(1);
	queue.offer(2);
    }

    // 7. Offer with time-outs
    public static void main7(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
	queue.offer(1, 1, TimeUnit.SECONDS);
	queue.offer(2, 1, TimeUnit.SECONDS);
    }

    // 8. Offer with time-out handling exception.
    public static void main8(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
	try {
	    queue.offer(1, 5, TimeUnit.SECONDS);
	    queue.offer(2, 5, TimeUnit.SECONDS);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    // 9. Remove from an empty queue.
    public static void main9(String[] args) {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(0);
	queue.remove();
	// queue.put(1);
    }

}

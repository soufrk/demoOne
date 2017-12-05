package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Demo for special operations in <tt>BlockingQueue</tt>.
 * 
 * @author soufrk
 *
 */
public class BlockingQueueBehaviour {

    private static final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);

    public static void main1(String[] args) throws InterruptedException {

	/*
	 * An instant removal to make space for an offer().
	 */
	new Thread() {
	    public void run() {
		queue.poll();
	    }
	}.start();
    }

    /*
     * Poll with a timeout.
     */
    public static void main2(String[] args) throws InterruptedException {
	new Thread() {
	    public void run() {
		try {
		    String result = queue.poll(1, TimeUnit.SECONDS);
		    System.out.println(result);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}.start();
    }

    /*
     * An instant insertion to see poll() behaviour.
     */
    public static void main3(String[] args) throws InterruptedException {
	new Thread() {
	    public void run() {
		try {
		    String result = queue.poll(20, TimeUnit.SECONDS);
		    System.out.println(result);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}.start();

	new Thread() {
	    public void run() {
		try {
		    queue.put("First");
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}.start();
    }

    /*
     * Timeout offer() method on an already full queue.
     */
    public static void main4(String[] args) throws InterruptedException {
	queue.put("A");
	queue.put("B");
	queue.put("C");
	queue.put("D");

	new Thread() {
	    public void run() {
		try {
		    boolean result = queue.offer("First", 1, TimeUnit.SECONDS);
		    System.out.println("Offering result:" + result);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}.start();
    }
    
    public static void main(String[] args) throws InterruptedException {
	
    }

}

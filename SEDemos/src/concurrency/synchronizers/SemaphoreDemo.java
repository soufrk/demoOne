package concurrency.synchronizers;

import java.util.Date;
import java.util.concurrent.Semaphore;

/**
 * A very simple example and introduction to using Semaphores.
 * 
 * Use-case: Two threads counting numbers using one semaphore.
 * Note: This is not a practical requirement to use a semaphore although.
 * 
 * @author soufrk
 *
 */
public class SemaphoreDemo extends Thread {

    // Declare a semaphore with number of permits.
    private static final Semaphore MUTEX = new Semaphore(1);
    private int counter;

    public SemaphoreDemo() {
	counter = 0;
    }

    public static void main(String[] args) {
	Thread t1 = new SemaphoreDemo();
	t1.setName("Thread One");
	Thread t2 = new SemaphoreDemo();
	t2.setName("Thread Two");
	t1.start();
	t2.start();
	try {
	    t1.join();
	    t2.join();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	// CRITICAL SECTION
	while (counter < 50) {
	    try {
		MUTEX.acquire();// Blocks till the semaphore gives a permit.
		System.out.println(this.getName() + " acquires mutex.");
		Date d = new Date();
		if (d.getSeconds() % 2 == 0) {
		    counter++;
		    System.out.println("Incrementing " + this.getName() + " to value:" + counter);
		    System.out.println(this.getName() + " releases mutex.");
		    MUTEX.release();
		    //this.sleep(1000L);
		} else {
		    System.out.println(this.getName() + " releases mutex.");
		    MUTEX.release();// Release the permit to semaphore for others to use
		    this.sleep(5000L); // Add some randomness
		}
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

}

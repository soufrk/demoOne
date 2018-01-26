package threads;

/**
 * Basics of Thread
 * <ul>
 * <li>Invoking run() doesn't create a new Thread.</li>
 * <li>Invoking start() more than once results in exception</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class Thread01 {

    public static void main(String[] args) {
	Thread t = new Thread(new A());
	t.run();
	t.run();

	t.start();
	t.start();
    }

}

class A implements Runnable {

    public void run() {
	System.out.println("hello");
    }

}
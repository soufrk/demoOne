package temp;

/**
 * Simple deadlock by using join() method.
 * 
 * @author soufrk
 *
 */
public class TheJoinDeadlock extends Thread {

    public static void main(String[] args) {
	Thread t = new TheJoinDeadlock();
	try {
	    t.start();
	    Thread.currentThread().join();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
    
    @Override
    public void run() {
        System.out.println("In the run method");
    }

}

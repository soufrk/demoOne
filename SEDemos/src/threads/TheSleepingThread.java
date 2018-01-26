package threads;

/**
 * Is anything sleeping over here ?
 * 
 * @author soufrk
 *
 */
public class SleepingThread {

    public static void main(String[] args) {
	Thread t = new Thread();
	try {
	    t.sleep(5000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}

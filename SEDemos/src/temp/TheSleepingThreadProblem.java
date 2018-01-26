package temp;

/**
 * Is anything sleeping over here ?
 * 
 * @author soufrk
 *
 */
public class TheSleepingThreadProblem {

    public static void main(String[] args) {
	Thread t = new Thread();
	try {
	    t.sleep(5000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}

package temp;

/**
 * Assuming things to be perfect, what should be the difference in 
 * the timestamps printed in the output, at least theoretically.
 * 
 * @author soufrk
 *
 */
public class AnotherSleep extends Thread {

    public static void main(String[] args) {
	Thread t = new AnotherSleep();
	try {
	    t.start();
	    System.out.println(System.currentTimeMillis());
	    t.sleep(2000);
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

    }
    
    @Override
    public void run() {
	try {
	    this.sleep(2000);
	    System.out.println(System.currentTimeMillis());
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}

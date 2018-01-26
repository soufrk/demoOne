package temp;

/**
 * Can we invoke start() multiple times on the same thread object
 * 
 * @author soufrk
 *
 */
public class TheNeverEndingStartProblem extends Thread {

    public static void main(String[] args) {
	Thread t = new TheNeverEndingThreadProblem();
	try {
	    while (true) {
		t.start();
		t.sleep(5000);
	    }
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	this = new TheNeverEndingThreadProblem();
    }

}

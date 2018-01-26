package temp;

/**
 * Let's put an end to if a sleeping-thread holds a lock
 * or not.
 * 
 * @author soufrk
 *
 */
public class SleepingThreadHoldsLock extends Thread {

    public static void main(String[] args) {
	Thread t1 = new TheSleepyThread();
	Thread t2 = new Thread(new TheNonSleepyThread());
	t1.start();
	t2.start();
    }
    
    private static class TheSleepyThread extends Thread {
	@Override
	public void run() {
	    synchronized (SleepingThreadHoldsLock.class) {
		try {
		    sleep(10000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}
    }
    
    private static class TheNonSleepyThread implements Runnable {
	@Override
	public void run() {
	    synchronized (SleepingThreadHoldsLock.class) {
		try {
		    wait(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		} catch (IllegalMonitorStateException e){
		    System.out.println("Unable to acquire lock !!!!!");
		    e.printStackTrace();
		}
	    }
	}
    }

}

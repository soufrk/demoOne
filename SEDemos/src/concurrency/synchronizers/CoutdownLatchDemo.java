package concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * A simple use-case demo for count-down latch.
 * 
 * Use-case: Assuming each thread completes 25% of a given work,
 * let calling thread wait for count downs to mark completion. 
 * 
 * @author soufrk
 *
 */
public class CoutdownLatchDemo extends Thread {
    
    private static CountDownLatch LATCH = new CountDownLatch(4);
    private static final int TOTAL_WORK = 100;
    private static int WORK_DONE = 0;
    private int percentWork;
    
    public CoutdownLatchDemo(int percentWork){
	this.percentWork = percentWork;
    }

    public static void main(String[] args) {
	Thread t = new CoutdownLatchDemo(25);
	t.start();
	try {
	    System.out.println("Waiting for work to be finished");
	    LATCH.await();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	System.out.println("Work finishes:" + WORK_DONE);
    }

    @Override
    public void run() {
	System.out.println(this.getName() + " completes work:" +  percentWork + "%");
	try {
	    WORK_DONE += percentWork;
	    this.sleep(1000L);// just to mimic doing some work
	    LATCH.countDown();
	    if(WORK_DONE < TOTAL_WORK)
		new CoutdownLatchDemo(percentWork).start();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}

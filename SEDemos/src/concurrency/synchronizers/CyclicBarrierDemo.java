package concurrency.synchronizers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo extends Thread {

    private static CyclicBarrier BARRIER = new CyclicBarrier(5, new Runnable() {

	@Override
	public void run() {
	    System.out.println("All threads have reached barrier !!");
	}
    });

    private static int TARGET = 10;
    private int count;
    private String name;

    public CyclicBarrierDemo(String name) {
	super(name);
    }

    public static void main(String[] args) {
	Thread[] threads = { new CyclicBarrierDemo("Thread One"), new CyclicBarrierDemo("Thread Two"),
		new CyclicBarrierDemo("Thread Three"), new CyclicBarrierDemo("Thread Four"),
		new CyclicBarrierDemo("Thread Five") };
	for (Thread t : threads)
	    t.start();
    }

    @Override
    public void run() {
	try {
	    count++;
	    System.out.println(this.getName() + ": current Count-" + count);
	    int index = BARRIER.await();
	    System.out.println(this.getName() + " reached barrier at index:" + index);
	} catch (InterruptedException | BrokenBarrierException e) {
	    e.printStackTrace();
	}
    }

}

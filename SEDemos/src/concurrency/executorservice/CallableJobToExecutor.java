package concurrency.executorservice;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Trying to simulate real multi-threading, using a singleton class.
 * 
 * It uses Callable implementation to gather results separately, post execution.
 * 
 * @author soufrk
 *
 */
public class CallableJobToExecutor {
    public static void main(String[] args) {

	/* The executor */
	ExecutorService executor = Executors.newFixedThreadPool(1000);

	/* Creating a list of 10k jobs */
	List<MyCallable> taskList = new LinkedList<>();
	for (int i = 0; i < 10000; i++) {
	    taskList.add(new MyCallable());
	}

	/* Bulk invocation */
	try {
	    executor.invokeAll(taskList);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	/* Shutting executor down */
	executor.shutdown();
    }

}

/*
 * Callable implementation that is assigned with the job of returning an
 * instance from singleton class.
 */
class MyCallable implements Callable<ExecSingleton> {

    ExecSingleton obj;

    /*
     * @Override public void run() { obj = ExecSingleton.getInstance();
     * System.out.println(obj.getInstanceCount()); }
     */

    @Override
    public ExecSingleton call() throws Exception {
	obj = ExecSingleton.getInstance();
	// System.out.println(obj.getInstanceCount());
	return obj;
    }

}

/*
 * A modified singleton class that keeps
 */
class ExecSingleton {
    private static ExecSingleton INSTANCE;
    private static int instanceCount;
    private static int modCount;

    private ExecSingleton() {
    }

    public static ExecSingleton getInstance() {
	long startThreadId = Thread.currentThread().getId();
	int startMod = modCount;
	if (INSTANCE == null) {
	    INSTANCE = new ExecSingleton();
	}
	if (modCount == startMod) {
	    // System.out.println("Returning instance in single thread");
	} else {
	    // System.out.println("Return interrupted by another thread");
	}
	if (startThreadId == Thread.currentThread().getId()) {
	    System.out.println("Returning instance in single thread");
	} else {
	    System.out.println("Return interrupted by another thread");
	}
	modCount++;
	return INSTANCE;
    }

    public int getInstanceCount() {
	modCount++;
	return this.instanceCount;
    }
}
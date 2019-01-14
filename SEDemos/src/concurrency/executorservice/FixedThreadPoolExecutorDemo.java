package concurrency.executorservice;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Simple use of fixed-thread-pool executor.
 * 
 * Use-case: Each thread counts from 0 till 50,000.
 * 
 * @author soufrk
 *
 */
public class FixedThreadPoolExecutorDemo {

    public static void main(String[] args) {
	ExecutorService executor = Executors.newFixedThreadPool(50);
	List<MyCallable03> taskList = new LinkedList<>();
	for (int i = 0; i < 10000; i++) {
	    taskList.add(new MyCallable03());
	}
	try {
	    executor.invokeAll(taskList);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	executor.shutdown();

    }

}

class MyCallable03 implements Callable<String> {

    @Override
    public String call() throws Exception {
	new ExecSingleton03().countTill50K();
	return "Completed";
    }

}

class ExecSingleton03 {

    private static int counter;

    public void countTill50K() {
	System.out.println("Thread:" + Thread.currentThread().getName() + "start with:" + counter);
	for (counter = 0; counter < 50000; counter++) {//do nothing}
	    System.out.println("Thread:" + Thread.currentThread().getName() + "end with:" + counter);
	}
    }
}
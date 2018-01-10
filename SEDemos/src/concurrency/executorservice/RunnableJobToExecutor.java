package concurrency.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Simple demonstration of Executors.
 * 
 * @author soufrk
 *
 */
public class RunnableJobToExecutor {

    public static void main1(String[] args) {
	/* Initializing an executor-service with a Thread-pool type. */
	ExecutorService executor = Executors.newFixedThreadPool(5);

	/* Assigning tasks to executor. */
	for (int i = 0; i < 100; i++) {
	    executor.submit(new MyTask());
	}

	/* Shutting executor down */
	executor.shutdown();
    }

    /**
     * But batch submit is not supported for Runnable tasks.
     * @param args
     */
    public static void main2(String[] args) {
	/* Initializing an executor-service with a Thread-pool type. */
	ExecutorService executor = Executors.newFixedThreadPool(5);

	/* Assigning tasks to executor. */
	for (int i = 0; i < 100; i++) {
	    executor.submit(new MyTask());
	}

	/* Creating a list of tasks to be submitted */
	List<Runnable> myTaskList = new ArrayList<>();
	Runnable myTask1 = new MyTask();
	myTaskList.add(myTask1);
	Runnable myTask2 = new MyTask();
	myTaskList.add(myTask2);
	Runnable myTask3 = new MyTask();
	myTaskList.add(myTask3);
	Runnable myTask4 = new MyTask();
	myTaskList.add(myTask4);
	Runnable myTask5 = new MyTask();
	myTaskList.add(myTask5);
	executor.invokeAll(myTaskList);

	/* Shutting executor down */
	executor.shutdown();
    }

}

class MyTask implements Runnable {

    static int a;
    final int b;
    public int c;

    public MyTask() {
	b = 0;
    }

    @Override
    public void run() {
	int d = 0;
	// System.out.println("Print this one");
	a++;
	c++;
	d++;
	System.out.println("MyTask [a= " + a + "b=" + b + ", c=" + c + ", d=" + d + "]");
    }

    @Override
    public String toString() {
	return "MyTask [b=" + b + ", c=" + c + "]";
    }

}

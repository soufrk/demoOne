package concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * What happens if a job submitted to executor lands with exception.
 * Will it stop the entire program ?
 * Or just the executor-service ?
 * 
 * @author soufrk
 *
 */
public class ExecutorServiceProblem {

    public static void main(String[] args) {
	ExecutorService executorService = Executors.newFixedThreadPool(4);
	System.out.println(executorService);
	executorService.submit(new Runnable() {
	    
	    @Override
	    public void run() {
		throw new NullPointerException();
	    }
	});
	System.out.println(executorService);
    }
    
}

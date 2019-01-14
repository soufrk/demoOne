package concurrency.synchronizers;

import java.util.concurrent.Exchanger;

/**
 * Simple demonstration of usage of an exchanger.
 * 
 * Use-case:Two threads exchanging String values to each oter.
 *  
 * @author soufrk
 *
 */
public class ExchangerDemo extends Thread{
    
    // Instantiating an Exchanger
    private static Exchanger<String> EXCHANGER = new Exchanger<>();
    private String message;
    
    public ExchangerDemo(String message){
	this.message = message;
    }
    
    public static void main1(String[] args) {
	Thread t1 = new ExchangerDemo("A");
	Thread t2 = new ExchangerDemo("B");
	t1.start();
	t2.start();
    }

    public static void main2(String[] args) {
	Thread t1 = new ExchangerDemo("A");
	Thread t2 = new ExchangerDemo("B");
	t1.start();
	//t2.start();
	try {
	    t1.join();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
    
    @Override
    public void run() {
        try {
	    String reply = EXCHANGER.exchange(message);// This is a blocking call
	    // to get message from exchanger.
	    System.out.println(reply);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}

package concurrency.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Demonstrates the ease of using of a <tt>BlockingQueue</tt>, to implement
 * multiple Producers/Consumers, without having to bother about complex
 * problems.
 * <p/>
 * Inspired from <a href=
 * "http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html">Jenkov'
 * s example</a>
 * 
 * @author soufrk
 *
 */
public class BlockingQueueDemo {

	public static void main(String[] args) {
		
		/* Create a BlockingQueue */ 
		BlockingQueue queue = new ArrayBlockingQueue(1024);

		/* Instatiate Producers & consumers asrequired */
		Producer producer1 = new Producer(queue, "Producer1");
		Producer producer2 = new Producer(queue, "Producer2");
		Consumer consumer1 = new Consumer(queue, "Consumer1");
		Consumer consumer2 = new Consumer(queue, "Consumer2");

		/* Start producers & consumers */ 
		new Thread(producer1).start();
		new Thread(producer2).start();
		new Thread(consumer1).start();
		// new Thread(consumer2).start();

	}

}

/**
 * Producer class; to be intiated with the BlockingQueue instance.
 * @author soufrk
 *
 */
class Producer implements Runnable {

	protected BlockingQueue queue = null;
	private final String producerName;

	public Producer(BlockingQueue queue, String producerName) {
		this.queue = queue;
		this.producerName = producerName;
	}

	/**
	 * Implement all put() operations on the Queue.
	 */
	@Override
	public void run() {
		try {
			System.out.println(producerName + " producing 1.");
			queue.put("1");
			Thread.sleep(1000);
			System.out.println(producerName + " producing 2.");
			queue.put("2");
			Thread.sleep(500);
			System.out.println(producerName + " producing 3.");
			queue.put("3");
			/*
			 * Thread.sleep(200); System.out.println(producerName +
			 * " producing 4."); queue.put("4"); Thread.sleep(1500);
			 * System.out.println(producerName + " producing 5.");
			 * queue.put("5"); Thread.sleep(300);
			 * System.out.println(producerName + " producing 6.");
			 * queue.put("6");
			 */
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * Consumer class; to be initiated with BlockingQueue instance. 
 * @author soufrk
 *
 */
class Consumer implements Runnable {

	protected BlockingQueue queue = null;
	private final String consumerName;

	public Consumer(BlockingQueue queue, String consumerName) {
		this.queue = queue;
		this.consumerName = consumerName;
	}

	/**
	 * Implement all take() operations on the Queue.
	 */
	@Override
	public void run() {
		try {
			System.out.println(consumerName + " consuming " + queue.take());
			Thread.sleep(5000);
			System.out.println(consumerName + " consuming " + queue.take());
			Thread.sleep(5000);
			System.out.println(consumerName + " consuming " + queue.take());
			Thread.sleep(5000);
			System.out.println(consumerName + " consuming " + queue.take());
			Thread.sleep(5000);
			System.out.println(consumerName + " consuming " + queue.take());
			Thread.sleep(5000);
			System.out.println(consumerName + " consuming " + queue.take());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
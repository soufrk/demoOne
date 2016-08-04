package multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Demo for special operations in <tt>BlockingQueue</tt>.
 * @author soufrk
 *
 */
public class BlockingQueue02 {

	public static void main(String[] args) throws InterruptedException {
		
		final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);
		
		/*
		 * Poll with a timeout.
		 */
		/*new Thread(){
			public void run(){
				try {
					String result = queue.poll(1, TimeUnit.SECONDS);
					System.out.println(result);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();*/
		
		/*
		 * An instant insertion to see poll() behaviour.
		 */
		/*new Thread(){
			public void run(){
				try {
					queue.put("First");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();*/
		
		/*
		 * Timeout offer() method on an already full queue. 
		 */
		queue.put("A");
		queue.put("B");
		queue.put("C");
		queue.put("D");
		
		new Thread(){
			public void run(){
				try {
					boolean result = queue.offer("First", 1, TimeUnit.SECONDS);
					System.out.println("Offering result:" + result);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		/*
		 * An instant removal to make space for an offer().
		 */
		new Thread(){
			public void run(){
				queue.poll();
			}
		}.start();
	}

}

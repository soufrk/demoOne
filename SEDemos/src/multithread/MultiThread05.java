package multithread;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * In order to decouple the scan(producer) & displaying scan result(consumer) to
 * work independent of each other, we need some kind of temporary data buffer in
 * between. But, again the problems of concurrency cannot be solved using core
 * methods.
 * 
 * @author soufrk
 *
 */

class MyThreadA implements Runnable {

	private String path;
	private static List<String> FILE_LIST;
	private static AtomicInteger ATOMIC_COUNTER;

	static {
		ATOMIC_COUNTER = new AtomicInteger(0);
		FILE_LIST = new LinkedList<>();
	}

	public MyThreadA(String path) {
		this.path = path;
	}

	@Override
	public void run() {
		try {
			int begin = ATOMIC_COUNTER.getAndIncrement();
			File filePath = new File(path);
			File[] listOfFiles = filePath.listFiles();
			synchronized (System.out) {
				for (File temp : listOfFiles) {
					if (temp.isFile()) {
						//FILE_LIST.add(temp.getAbsolutePath());
						System.out.println(temp.getAbsolutePath());
					} else if (temp.isDirectory()) {
						Thread t = new Thread(new MyThreadA(temp.getPath()));
						t.start();
					}
				}
			}
			MyThreadA.decrementCounter();
			//if(begin == 0)
				try {
					synchronized (FILE_LIST) {
						FILE_LIST.wait();
					}
					printList();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void decrementCounter() {
		if (ATOMIC_COUNTER.decrementAndGet() == 0)
			synchronized(FILE_LIST){
				FILE_LIST.notifyAll();
			}
	}
	
	private static void printList(){
		for(String temp:FILE_LIST){
			System.out.println(temp);
		}
	}

}

class MyThreadB implements Runnable {
	private String path;
	
	public MyThreadB(String path) {
		this.path = path;
	}

	@Override
	public void run() {
		try {
			File filePath = new File(path);
			File[] listOfFiles = filePath.listFiles();
			synchronized (System.out) {
				for (File temp : listOfFiles) {
					if (temp.isFile()) {
						System.out.println(temp.getAbsolutePath());
					} else if (temp.isDirectory()) {
						new Thread(new MyThreadB(temp.getPath())).start();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThread05 {

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		//System.setOut(new PrintStream("output5A.txt"));
		Thread threadA = new Thread(new MyThreadA(path));
		threadA.start();
		/*System.setOut(new PrintStream("output5B.txt"));
		Thread threadB = new Thread(new MyThreadB(path));
		threadB.start();*/
	}

}
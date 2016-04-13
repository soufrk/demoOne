package multithread;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * In order to decouple the scan(producer) & displaying scan result(consumer) to work independent of each other,
 * we need some kind of temporary data buffer in between. But, again the problems of concurrency cannot be solved
 * using core methods. 
 * @author soufrk
 *
 */
public class MultiThread04 implements Runnable{
	
	private String path;
	/*
	 * Notice here the use of volatile in anticipation for making operations on this atomic.
	 */
	private static int COUNTER, MAX_COUNT;
	private static volatile int VOLATILE_COUNTER;
	private static AtomicInteger ATOMIC_COUNTER;
	
	private static StringBuffer BUFFER;
	//private static List<String> FILE_PATHS;
	
	static{
		COUNTER = 0;
		MAX_COUNT = 0;
		VOLATILE_COUNTER = 0;
		ATOMIC_COUNTER = new AtomicInteger(0);
		BUFFER = new StringBuffer();
		//FILE_PATHS = new LinkedList<>();
	}
	
	public MultiThread04(String path){
		this.path = path;
	}
	
	/*
	 * (non-Javadoc) Let's try syncronizing on System.out so that one thread can print all output at a time. Hence all output of a single thread can be seen at
	 * a single place. But, this leads to a problem.
	 * 
	 * While a thread runs, lot of other parallel threads make request for System.out for printing. After a while the last requesting thread is given
	 * chance to run. This may lead to starvation of threads that had requested previously.   
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run(){
		try{
			MultiThread04.incrementCounter();
			File filePath = new File(path);
			File[] listOfFiles = filePath.listFiles();
			synchronized(System.out){
				for(File temp:listOfFiles){
					if(temp.isFile()){
						//BUFFER.append(String.format("\n%-10s prints path - %20s\nMax Count=%d", Thread.currentThread().getName(), temp.getAbsolutePath(), MAX_COUNT));
						//FILE_PATHS.add(output);
						//output += "\nmax count=" + MAX_COUNT;
						//System.out.print(String.format("\n%-10s prints path - %20s\nMax Count=%d", Thread.currentThread().getName(), temp.getAbsolutePath(), MAX_COUNT));
						System.out.print(String.format("\n%-10s prints path - %20s", Thread.currentThread().getName(), temp.getAbsolutePath()));
					}
					else if(temp.isDirectory()){
						Thread t = new Thread(new MultiThread04(temp.getPath()));
						/*System.out.println(String.format("\n\t\t\t\t%-10s spawns new thread - %10s, with path - %50s",
							Thread.currentThread().getName(), t.getName(), temp.getPath()));*/
						t.start();
					}
				}
			}
			MultiThread04.decrementCounter();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private static void incrementCounter(){
		//BUFFER.append(String.format("\n\t\t%-10s INCREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER));
		/*System.out.format("\n%-10s INCREMENTS ", Thread.currentThread().getName());
		System.out.format("\n\t\tCOUNTER AT - %02d, TO - %02d", COUNTER++, COUNTER);
		System.out.format("\n\t\tVOLATILE COUNTER AT - %02d, TO - %02d", VOLATILE_COUNTER++, VOLATILE_COUNTER);
		System.out.format("\n\t\tATOMIC COUNTER AT - %02d, TO - %02d", ATOMIC_COUNTER.getAndIncrement(), ATOMIC_COUNTER.get());*/
		MAX_COUNT++;
		//if(COUNTER > MAX_COUNT)
			//MAX_COUNT = COUNTER;
	}
	
	private static void decrementCounter(){
		//BUFFER.append(String.format("\n\t\t%-10s DECREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER));
		/*System.out.format("\n%-10s DECREMENTS ", Thread.currentThread().getName());
		System.out.format("\n\t\tCOUNTER AT - %02d, TO - %02d", COUNTER--, COUNTER);
		System.out.format("\n\t\tVOLATILE COUNTER AT - %02d, TO - %02d", VOLATILE_COUNTER--, VOLATILE_COUNTER);
		System.out.format("\n\t\tATOMIC COUNTER AT - %02d, TO - %02d", ATOMIC_COUNTER.getAndDecrement(), ATOMIC_COUNTER.get());*/
		if(ATOMIC_COUNTER.get() == 0)
				synchronized(System.out){
					System.out.notifyAll();
				}
		//COUNTER--;
	}

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		PrintStream out = new PrintStream("output4.txt");
		System.setOut(out);
		Thread t = new Thread(new MultiThread04(path));
		t.start();
		try {
			synchronized(System.out){
				System.out.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("\nCount=" + COUNTER + " Main Thread Exits.");
		/*while(COUNTER != 0){}
		System.out.println("Max Count" + MAX_COUNT);*/
		/*for(int i=0;i<10;i++){
			System.out.println("\nCount=" + COUNTER);
			System.out.println("Max Count" + MAX_COUNT);
		}*/
	}

}
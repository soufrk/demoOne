package multithread;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class MultiThread02 implements Runnable{
	
	private String path;
	private static int COUNTER, MAX_COUNT;
	//private static List<String> FILE_PATHS;
	
	static{
		COUNTER = 0;
		MAX_COUNT = 0;
		//FILE_PATHS = new LinkedList<>();
	}
	
	public MultiThread02(String path){
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
			MultiThread02.incrementCounter();
			File filePath = new File(path);
			File[] listOfFiles = filePath.listFiles();
			synchronized(System.out){
				for(File temp:listOfFiles){
					if(temp.isFile()){
						String output = String.format("\n%-10s prints path - %20s", Thread.currentThread().getName(), temp.getAbsolutePath());
						//FILE_PATHS.add(output);
						output += "\nmax count=" + MAX_COUNT;
						System.out.print(output);
					}
					else if(temp.isDirectory()){
						new Thread(new MultiThread02(temp.getPath())).start();
					}
				}
			}
			
			MultiThread02.decrementCounter();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private static void incrementCounter(){
		System.out.format("\n\t\t%-10s INCREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER);
		COUNTER++;
		MAX_COUNT++;
		//if(COUNTER > MAX_COUNT)
			//MAX_COUNT = COUNTER;
	}
	
	private static void decrementCounter(){
		System.out.format("\n\t\t%-10s DECREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER);
		COUNTER--;
	}

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		PrintStream out = new PrintStream("output2.txt");
		System.setOut(out);
		Thread t = new Thread(new MultiThread02(path));
		t.start();
		while(t.isAlive()){}
		System.out.println("\nCount=" + COUNTER + " Main Thread Exits.");
		/*while(COUNTER != 0){}
		System.out.println("Max Count" + MAX_COUNT);*/
		/*for(int i=0;i<10;i++){
			System.out.println("\nCount=" + COUNTER);
			System.out.println("Max Count" + MAX_COUNT);
		}*/
	}

}


package multithread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class MultiThread01 implements Runnable{
	
	private String path;
	private static int COUNTER, MAX_COUNT;
	//private static List<String> FILE_PATHS;
	
	static{
		COUNTER = 0;
		MAX_COUNT = 0;
		//FILE_PATHS = new LinkedList<>();
	}
	
	public MultiThread01(String path){
		this.path = path;
	}
	
	/*
	 * (non-Javadoc) While spawning a new thread at every new directory is ensured, but there is no guarantee of these threads executing and
	 * printing output in sync with each other.  
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run(){
		try{
			MultiThread01.incrementCounter();
			File filePath = new File(path);
			File[] listOfFiles = filePath.listFiles();
			for(File temp:listOfFiles){
				if(temp.isFile()){
					String output = String.format("\n%-10s prints path - %20s", Thread.currentThread().getName(), temp.getAbsolutePath());
					//FILE_PATHS.add(output);
					//output += "\nMAX_COUNT=" + MAX_COUNT;
					System.out.print(output);
				}
				else if(temp.isDirectory()){
					new Thread(new MultiThread01(temp.getPath())).start();
				}
			}
			MultiThread01.decrementCounter();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Running multiple simulations reveal that this method may get called multiple times back-to-back by multiple threads, 
	 * without printing any reflection of it.
	 * 
	 * Hence this method runs possibility of STALE DATA.
	 */
	private static void incrementCounter(){
		//System.out.format("\n\t\t%-10s INCREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER);
		COUNTER++;
		MAX_COUNT++;
		//if(COUNTER > MAX_COUNT)
			//MAX_COUNT = COUNTER;
	}
	
	/*
	 * Running multiple simulations reveal that this method may get called multiple times back-to-back by multiple threads, 
	 * without printing any reflection of it.
	 * 
	 * Hence this method runs possibility of STALE DATA.
	 */
	private static void decrementCounter(){
		//System.out.format("\n\t\t%-10s DECREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER);
		COUNTER--;
	}

	public static void main1(String[] args) throws IOException {
		//String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		String path = "C:/WORK";
		//String path = "C:/";
		PrintStream out = new PrintStream("output1.txt");
		System.setOut(out);
		Thread t = new Thread(new MultiThread01(path));
		t.start();
		while(t.isAlive()){}
		//System.out.println("\nMAIN THREAD EXITS with count=" + COUNTER);
		/*while(COUNTER != 0){}
		System.out.println("Max Count" + MAX_COUNT);*/
		/*for(int i=0;i<10;i++){
			System.out.println("\nCount=" + COUNTER);
			System.out.println("Max Count" + MAX_COUNT);
		}*/
	}
	
	public static void main(String[] args) throws IOException {
		//String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		//String path = "C:/";
		PrintStream out = new PrintStream("output1.txt");
		System.setOut(out);
		Thread t = new Thread(new MultiThread01("C:/WORK"));
		t.start();
		while(t.isAlive()){}
		
		t = new Thread(new MultiThread01("C:/Users/souvik.goswami/git"));
		t.start();
		while(t.isAlive()){}
		
		t = new Thread(new MultiThread01("C:/theMediaFolder"));
		t.start();
		while(t.isAlive()){}
		//System.out.println("\nMAIN THREAD EXITS with count=" + COUNTER);
		/*while(COUNTER != 0){}
		System.out.println("Max Count" + MAX_COUNT);*/
		/*for(int i=0;i<10;i++){
			System.out.println("\nCount=" + COUNTER);
			System.out.println("Max Count" + MAX_COUNT);
		}*/
	}

}

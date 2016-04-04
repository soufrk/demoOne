package algorithms;

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
					
					System.out.print(output);
				}
				else if(temp.isDirectory()){
					new Thread(new MultiThread01(temp.getPath())).start();;
				}
			}
			MultiThread01.decrementCounter();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private static void incrementCounter(){
		System.out.format("\n%-10s increments counter at - %4d", Thread.currentThread().getName(), COUNTER);
		COUNTER++;
		if(COUNTER > MAX_COUNT)
			MAX_COUNT = COUNTER;
	}
	
	private static void decrementCounter(){
		System.out.format("\n%-10s derements counter at - %4d", Thread.currentThread().getName(), COUNTER);
		COUNTER--;
	}

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		PrintStream out = new PrintStream("output.txt");
		System.setOut(out);
		Thread t = new Thread(new MultiThread01(path));
		t.start();
		while(t.isAlive()){}
		System.out.println("\nCount=" + COUNTER);
		/*while(COUNTER != 0){}
		System.out.println("Max Count" + MAX_COUNT);*/
		/*for(int i=0;i<10;i++){
			System.out.println("\nCount=" + COUNTER);
			System.out.println("Max Count" + MAX_COUNT);
		}*/
	}

}

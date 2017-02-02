package multithread;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class DirectoryTraverse1 implements Runnable{
	
	private static ExecutorService executor = Executors.newFixedThreadPool(10);
	private static final String OUTPUT_FILE = "output2.txt";
	private static AtomicInteger COUNTER = new AtomicInteger(0);
	
	public static void main(String args[]){
		{
			try {
				Files.write(Paths.get(OUTPUT_FILE), "".getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**/
		//executor.execute(new Test001("C:/WORK/Workspaces/SOCKET/SEDemos_OLD/src"));
		
		try {
			
			PrintStream out = new PrintStream(OUTPUT_FILE);
			System.setOut(out);
			/*Thread t = new Thread(new Test001("C:/"));
			t.start();
			t.join();*/
			executor.execute(new DirectoryTraverse1("C:/WORK"));
			/*executor.execute(new Test001("C:/WORK/Workspaces/SOCKET/SEDemos_OLD/src"));
			executor.shutdown();
			executor.awaitTermination(30L, TimeUnit.MINUTES);*/
			while(COUNTER.get() != 0){}
			executor.shutdown();
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			executor.shutdown();
		} finally{
			executor.shutdown();
		}
	}
	
	private final Path path;
	
	public DirectoryTraverse1() {
			this(null);
		}
	
	public DirectoryTraverse1(String path){
		this.path = Paths.get(path).toAbsolutePath();
		COUNTER.incrementAndGet();
		//System.out.format("Adding a new directory - %s, Counter=%d\n", path, COUNTER.incrementAndGet());
	}
	
	@Override
	public void run() {
		List<Runnable> listOfDirs = new LinkedList<>();
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(path);
				) {
			//System.out.format("Starting %s  for path:%s\n", , path);
	        for (Path temp: stream) {
	            if(temp.toFile().isDirectory()){
	            	//new Thread(new Test001(temp.getName())).start();
	            	listOfDirs.add(new DirectoryTraverse1(temp.toString()));
	            }/*else{
	            	System.out.println(temp.toString());
	            }*/
	            String pathname = temp.toString() + "\n";
	            Files.write(Paths.get(OUTPUT_FILE), pathname.getBytes(), StandardOpenOption.APPEND);
	        }
	        COUNTER.decrementAndGet();
	        //System.out.format("Completed scanning path - %s, Counter=%d\n", path, COUNTER.decrementAndGet());
	        for(Runnable t:listOfDirs){
	        	//t.start();
	        	executor.submit(t);
	        }
		} catch(AccessDeniedException e){
			System.out.println("Skipping directory - " + path);
		} catch(Exception e){
			System.out.println("Exception in for path:" + path);
			e.printStackTrace();
		}
	}
	
}
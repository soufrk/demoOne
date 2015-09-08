package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor01 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//List<Runnable> myTaskList = new ArrayList<>();
		//Runnable myTask1 = new MyTask();
		//myTaskList.add(myTask1);
		//Runnable myTask2 = new MyTask();
		//myTaskList.add(myTask2);
		//Runnable myTask3 = new MyTask();
		//myTaskList.add(myTask3);
		//Runnable myTask4 = new MyTask();
		//myTaskList.add(myTask4);
		//Runnable myTask5 = new MyTask();
		//myTaskList.add(myTask5);
		
		for(int i=0; i<100; i++){
			executor.submit(new MyTask());
		}
		//executor.
		executor.shutdown();

	}

}

class MyTask implements Runnable{
	
	static int a;
	final int b;
	public int c;
	
	public MyTask() {
		b = 0;
	}

	@Override
	public void run() {
		int d = 0; 
		//System.out.println("Print this one");
		a++;c++;d++;
		System.out.println("MyTask [a= " + a + "b=" + b + ", c=" + c + ", d=" + d + "]");
	}

	@Override
	public String toString() {
		return "MyTask [b=" + b + ", c=" + c + "]";
	}
	
}

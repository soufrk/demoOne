package threads;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor02 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1000);
		List<Executor2> taskList = new LinkedList<>();
		for(int i=0; i<10000; i++){
			taskList.add(new Executor2());
		}
		try {
			executor.invokeAll(taskList);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
	}

}

class Executor2 implements Callable<ExecSingleton>{
	
	ExecSingleton obj;

	/*@Override
	public void run() {
		obj = ExecSingleton.getInstance();
		System.out.println(obj.getInstanceCount());
	}*/

	@Override
	public ExecSingleton call() throws Exception {
		obj = ExecSingleton.getInstance();
		System.out.println(obj.getInstanceCount());
		return obj;
	}
	
}

class ExecSingleton{
	private static ExecSingleton INSTANCE;
	private static int instanceCount;
	private static int modCount;
	private ExecSingleton(){}
	
	public static ExecSingleton getInstance(){
		int startMod = modCount;
		if(INSTANCE == null){
			INSTANCE = new ExecSingleton();
		}
		if(modCount == startMod){
			System.out.println("Update in single thread");
		}
		modCount++;
		return INSTANCE;
	}
	
	public int getInstanceCount(){
		modCount++;
		return this.instanceCount;
	}
}
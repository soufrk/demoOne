package concurrency;

import java.util.concurrent.Callable;

/**
 * Callable Vs Runnable
 * Difference in syntax and structure.
 * @author souvik.goswami
 *
 */
public class CallableVsRunnableSyntax {

	public static void main(String[] args) {
		
		Callable c = new Callable(){
			@Override
			public Object call() throws Exception {
				return null;
			}
		};
		
		Runnable r = new Runnable(){
			@Override
			public void run() {}
		};

	}

}

package threads;

/**
 * Think you can make a thread wait out of nowhere ??
 * Think again !!
 * @author soufrk
 *
 */
public class Thread02 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Thread02 t = new Thread02();
		t.start();
		t.wait();

	}
	
	@Override
	public void run() {
		System.out.println("Executing Run");
	}

}

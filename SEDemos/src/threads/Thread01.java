package threads;

public class Thread01 {

	public static void main(String[] args) {
		Thread t = new Thread(new A());
		t.run();
		t.run();
		t.start();

	}

}

class A implements Runnable{
	
	public void run(){
		System.out.println("hello");
	}
	
}
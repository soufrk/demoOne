package innerclass;

public class InnerClass07 {

	public static void main(String[] args) {
		

	}
	
	class MyInner implements Runnable{
		@Override
		public void run() {
			System.out.println("Hello World !!");
		}
	}
}

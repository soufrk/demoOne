package innerclass;

/**
 * Given that the following will not compile,
 * which line will report an error in compilation.
 * 
 * @author soufrk
 *
 */
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("Hello World");
			}
		}
		
		Thread t = new Thread(r);
	}

}

package innerclass;

/**
 * Demonstration of anonymous inner class - II (implement interface)
 * 
 * @author soufrk
 *
 */
public class InnerClass08 {

	public static void main(String[] args) {
		/*MyInterface reference = new MyInterface() {
			@Override
			public void show() {
				System.out.println("Hello");
			}
		};
		
		reference.show();*/

		// Similarly,
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		r.run();
	}

}

/* Some external interface */
interface MyInterface {
	final String message = "";

	void show();
	// void display();
}

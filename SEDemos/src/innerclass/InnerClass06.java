package innerclass;

/**
 * Demonstration of anonymous Inner class.
 * @author soufrk
 *
 */
public class InnerClass06 {

	public static void main(String[] args) {
		MyInterface reference = new MyInterface() {
			
			@Override
			public void show() {
				System.out.println("Hello");
			}
			
			
			
		};
		reference.show();
	}

}

interface MyInterface{
	final String message = "";
	void show();
	//void display();
}

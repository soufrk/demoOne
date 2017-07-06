package innerclass;

/**
 * A method-local inner class cannot access local field of the method.
 * 
 * @author soufrk
 *
 */
public class InnerClass06 {

	public void show() {
		int x = 0;
		final int y = -2; 
		class Inner {
			int x = -1; // Comment this line and see the output.
			public void show() {
				x++; // With previous line commented, difference between Java 7 & 8. 
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner inner = new Inner();
		inner.show();
	}

	public static void main(String[] args) {
		new InnerClass06().show();
	}

}

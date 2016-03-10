package innerclass;

/**
 * Example of method local Inner class and access restriction on local fields.
 * 
 * @author soufrk
 *
 */
public class InnerClass05 {

	public void show() {
		int x = 0;
		final int y = -2; 
		class Inner {
			int x = -1; // Comment this line and see the output

			public void show() {
				x++;
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner inner = new Inner();
		inner.show();
	}

	public static void main(String[] args) {
		new InnerClass05().show();
	}

}

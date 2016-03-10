package innerclass;

/**
 * Access scope of various fields in Inner Class design.
 * 
 * @author soufrk
 *
 */
public class InnerClass04 {

	private int x;

	public InnerClass04() {
		x = -1;
	}

	class Inner {
		int x;

		public void show() {
			int x = 1;
			System.out.println("x = " + x); // access Inner class field
			System.out.println("this.x = " + this.x); // access method local
														// field
			System.out.println("InnerClass04.this.x = " + InnerClass04.this.x); // access
																				// Outer
																				// class
																				// field
		}
	}

	public static void main(String[] args) {
		InnerClass04.Inner inner = new InnerClass04().new Inner();
		inner.show();
	}

}

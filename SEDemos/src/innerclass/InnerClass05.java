package innerclass;

/**
 * Access of various scoped variable of same name inside simple inner class.
 * 
 * @author soufrk
 *
 */
public class InnerClass05 {

	private int x;

	public InnerClass05() {
		x = -1;
	}

	class Inner {
		int x;

		public void show() {
			int x = 1;
			System.out.println("x = " + x); // access method local field
			System.out.println("this.x = " + this.x); // access Inner class field
			System.out.println("InnerClass05.this.x = " + InnerClass05.this.x); // access Outer class field
		}
	}

	public static void main(String[] args) {
		InnerClass05.Inner inner = new InnerClass05().new Inner();
		inner.show();
	}

}

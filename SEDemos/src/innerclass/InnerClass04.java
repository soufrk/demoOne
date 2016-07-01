package innerclass;

/**
 * Demonstrates the inner class can access and modify outer class fields from
 * inner class, just like any other method of class.
 * 
 * @author soufrk
 *
 */
public class InnerClass04 {
	
	private int x;
	protected int y;
	public int z;
	int w;
	
	public InnerClass04(){
		w = -1;
		x = 0;
		y = 1;
		z = 2;
	}

	public static void main(String[] args) {
		InnerClass04 outer = new InnerClass04();
		InnerClass04.Inner inner = outer.new Inner();
		inner.showOuterFields();
		inner.changeOuterFields();
	}
	
	class Inner{
		public void showOuterFields(){
			System.out.println("Outer w=" + w);
			System.out.println("Outer x=" + x);
			System.out.println("Outer y=" + y);
			System.out.println("Outer z=" + z);
		}
		
		public void changeOuterFields(){
			System.out.println("Outer w=" + ++w);
			System.out.println("Outer x=" + ++x);
			System.out.println("Outer y=" + ++y);
			System.out.println("Outer z=" + ++z);
		}
	}

}

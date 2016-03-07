package innerclass;

/**
 * Simple class to demonstrate access grants of a simple inner class towards
 * fields of outer class.
 * @author souvik.goswami
 *
 */
public class InnerClass03 {
	
	private int x;
	protected int y;
	public int z;
	int w;
	
	public InnerClass03(){
		w = -1;
		x = 0;
		y = 1;
		z = 2;
	}

	public static void main(String[] args) {
		InnerClass03 outer = new InnerClass03();
		InnerClass03.Inner inner = outer.new Inner();
		inner.showOuterFields();
	}
	
	class Inner{
		public void showOuterFields(){
			System.out.println("Outer x=" + x);
			System.out.println("Outer y=" + y);
			System.out.println("Outer z=" + z);
			System.out.println("Outer w=" + w);
		}
	}

}

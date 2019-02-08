package innerclass;

/**
 * Demonstrates that inner class can access and modify outer class fields from
 * within the inner class, just like any other method of class.
 * 
 * @author soufrk
 *
 */
public class InnerClassModifyOuterClassFields {

    private int x;
    protected int y;
    public int z;
    int w;

    public InnerClassModifyOuterClassFields() {
	w = -1;
	x = 0;
	y = 1;
	z = 2;
    }

    public static void main(String[] args) {
	InnerClassModifyOuterClassFields outer = new InnerClassModifyOuterClassFields();
	InnerClassModifyOuterClassFields.Inner inner = outer.new Inner();
	inner.showOuterFields();
	inner.changeOuterFields();
    }

    class Inner {
	public void showOuterFields() {
	    System.out.println("Outer w=" + w);
	    System.out.println("Outer x=" + x);
	    System.out.println("Outer y=" + y);
	    System.out.println("Outer z=" + z);
	}

	public void changeOuterFields() {
	    System.out.println("Outer w=" + ++w);
	    System.out.println("Outer x=" + ++x);
	    System.out.println("Outer y=" + ++y);
	    System.out.println("Outer z=" + ++z);
	}
    }

}

package basics;

/**
 * So, how do you think modifying class properties in a method, behaves ?
 * What about object references ?
 * 
 * @author soufrk
 *
 */
public class ModifyArgument {

    static int x;
    static Integer y;
    static MyNumber m;
    
    static class MyNumber {
	int x;

	public int getX() {
	    return x;
	}

	public void setX(int x) {
	    this.x = x;
	}

	@Override
	public String toString() {
	    return "MyNumber [x=" + x + "]";
	}
    }
    
    // Change primitive int.
    private static int changeX(int x) {
	x++;
	System.out.println("Value in method x = " + x);
	return x;
    }

    // Change wrapper Integer.
    private static Integer changeY(Integer y) {
	y++;
	System.out.println("Value in method y = " + y);
	return y;
    }

    // Change object instance.
    private static MyNumber changeMyNumber(MyNumber m) {
	m.x++;
	System.out.println(m);
	return m;
    }

    public static void main(String[] args) {
	System.out.println("======== Primitive int ========");
	System.out.println("Before change x = " + x);
	// Change primitive int.
	System.out.println("Method change returns = " + changeX(x));
	System.out.println("After change x = " + x);
	
	System.out.println("======== Wrapper Integer ========");
	y = 0;
	System.out.println("Before change y = " + y);
	// Change wrapper Integer.
	System.out.println("Method change returns = " + changeY(y));
	System.out.println("After change y = " + y);
	
	System.out.println("======== Object Instance ========");
	// Change object reference.
	m = new MyNumber();
	System.out.println("Before change m = " + m);
	System.out.println("Method change returns = " + changeMyNumber(m));
	System.out.println("After change m = " + m);
    }

}

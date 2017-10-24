package basics.ooad;

/**
 * Predict the output.
 * 
 * @author soufrk
 *
 */
public class OverrideConfusion01 {

    public static void main(String[] args) {
	new B94().methodOne();
    }
}

class A94 {
    public void methodOne() {
	System.out.println("A One");
	// Either of below lines
	methodTwo();
	this.methodTwo();
    }

    public void methodTwo() {
	System.out.println("A Two");
    }
}

class B94 extends A94 {
    public void methodOne() {
	System.out.println("B One");
	super.methodOne();
    }

    public void methodTwo() {
	System.out.println("B Two");
    }
}
package interfaces;

/**
 * So, how do we access a field of an interface ?
 * 
 * @author soufrk
 *
 */
public class AccessingInterfaceField implements MyInterface {
    final String message;

    public AccessingInterfaceField() {
	message = "Hello";
    }

    public void show() {
	System.out.println(message);
	System.out.println(super.message);
    }

    public static void main(String args[]) {
	AccessingInterfaceField child = new AccessingInterfaceField();
	child.show();
    }

}

interface MyInterface {
    String message = "World";
}

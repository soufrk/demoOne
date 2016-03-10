package interfaces;

/**
 * What if there are same name final variables in both an Interface and the
 * concrete implementation.
 * 
 * Given that if it allowed, how can we access the variable of interface.
 * @author soufrk
 *
 */
public class Interface002 implements MyInterface003 {

	static final String message = "World";
	//final String message;
	public Interface002(){ //message = "New Value"; 
	}

	public static void main(String[] args) {
		System.out.println(message);
		System.out.println(MyInterface003.message);
	}

}

interface MyInterface003 {
	String message = "Hello";
}

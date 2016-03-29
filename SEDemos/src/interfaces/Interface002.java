package interfaces;

/**
 * What if there are final variables of same name in both an interface and the
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
		/* Since interface fields are static and final
		 * they should be accessed in a static way.
		 */
		System.out.println(MyInterface003.message);
		
	}

}

interface MyInterface003 {
	String message = "Hello";
}

package interfaces;

interface MyInterface {
	String message = "World";
}

/**
 * Continuing with last example, keyword super is not applicable for Interfaces,
 * as there can be no instance on an interface.
 *  
 * @author soufrk
 *
 */
public class Interface003 implements MyInterface{
	//final String message = "Hello";
	final String message;
	
	public Interface003(){
		message = "Hello";
	}
	public void show(){
		System.out.println(message);
		
		/* Cannot be since there can be no instance of an interface. */
		//System.out.println(super.message);
		
		System.out.println(MyInterface.message);
	}
	
	public static void main(String args[]){
		/*Child child = new Child();
		child.showStatic();*/
		
		Interface003 child = new Interface003();
		child.show();
	}

}

class Parent{
	static final String message = "World";
	//final String message = "";
	//private static final String message = "";
	public static void show(){
		System.out.println(message);
	}
}
class Child extends Parent{
	//static final String message = "";
	//final String message = "";
	final String message;
	public Child(){
		//message = "Hello";
		//Child.message = "Hello";
		this.message = "Hello";
	}
	public void showStatic(){
		System.out.println(message);
		System.out.println(super.message);
		System.out.println(Parent.message);
	}
}
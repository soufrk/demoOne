package abstractclasses;

/**
 * Demonstrates that an abstract class,<ul>
 * <li>need not have even a single method.</li>
 * <li>can have no abstract methods as well.</li>
 * <li>can have only non-abstract methods only as well.</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class AbstractClass01 extends MyAbstract01 {
	public static void main(String args[]){
		AbstractClass01 object = new AbstractClass01();
		object.show();
	}
}

abstract class MyAbstract01 {
	void show(){
		System.out.println("Hello World !!");
	}
}

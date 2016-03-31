package abstractclasses;

/**
 * Interestingly, no instantiation does not prevent an abstract class
 * from having a constructor. As, subclass constructor will invoke it.
 * @author soufrk
 *
 */
public class AbstractClass02 extends MyAbstract02{

	public static void main(String[] args) {
		AbstractClass02 object = new AbstractClass02();

	}

}

abstract class MyAbstract02{
	public MyAbstract02(){
		System.out.println("Hello World !!");
	}
}
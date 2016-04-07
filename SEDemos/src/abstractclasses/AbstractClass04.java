package abstractclasses;

/**
 * Can main method in an abstract class be executed ?
 * @author soufrk
 *
 */
public abstract class AbstractClass04 extends Base{

	public static void main(String[] args) {
		Base b = new Base();
		b.print();
	}

}

class Base{
	public void print(){
		System.out.println("Printing");
	}
}

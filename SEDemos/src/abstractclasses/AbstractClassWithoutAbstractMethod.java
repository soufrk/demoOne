package abstractclasses;

/**
 * Demonstrates that an abstract class,
 * <ul>
 * <li>need not have even a single method.</li>
 * <li>can have no abstract methods as well.</li>
 * <li>can have only non-abstract methods only as well.</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class AbstractClassWithoutAbstractMethod extends MyAbstract01 {
    public static void main(String args[]) {
	AbstractClassWithoutAbstractMethod object = new AbstractClassWithoutAbstractMethod();
	object.show();
    }
}

abstract class MyAbstract01 {
    void show() {
	System.out.println("Hello World !!");
    }
}

package innerclass;

/**
 * Scope of method-local inner class starts only post it's declaration.
 * 
 * @author soufrk
 *
 */
public class MethodLocalInnerClassScope {

    public void shaow() {
	MyClass objA = new MyClass();
	class MyClass {}
	MyClass objB = new MyClass();
    }

}

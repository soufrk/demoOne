package basics.ooad;

/**
 * Overload ambiguity - Varargs Vs Array Vs Type argument.
 * Which line should have a compilation error, if at all.
 * @author soufrk
 *
 */
public class OverloadAmbiguityVarargs {

    public void test(String s) {
	System.out.println("String");
    }

    public void test(String... s) {
	System.out.println("String list");
    }

    public void test(String[] s) {
	System.out.println("Object");
    }

    public static void main(String[] args) {
	OverloadAmbiguityVarargs q = new OverloadAmbiguityVarargs();
	q.test("Hello");
    }
}

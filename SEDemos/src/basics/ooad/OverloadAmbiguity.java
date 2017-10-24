package basics.ooad;

/**
 * Overload ambiguity - passing null as argument.
 * Predict the output.
 * 
 * @author soufrk
 *
 */
public class OverloadAmbiguity {

    public void test(String s) {
	System.out.println("String");
    }

    public void test(Object o) {
	System.out.println("Object");
    }

    public void test(Integer o) {
	System.out.println("Object");
    }

    public static void main(String[] args) {
	OverloadAmbiguity q = new OverloadAmbiguity();
	q.test(null);
    }
}

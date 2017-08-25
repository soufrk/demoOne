package basics;

class SuperClass {
    public SuperClass() {
	foo();
    }

    public void foo() {
	System.out.println("In superclass foo");
    }
}

/**
 * Not every safe looking code is always safe at runtime. So, which version of
 * <tt>foo()</tt> gets invoked ?
 * 
 * @author soufrk
 *
 */
public class ItsTooLateToInitialize extends SuperClass {

    public ItsTooLateToInitialize() {
	member = "HI";
    }

    public void foo() {
	System.out.println("In derived foo" + member.toLowerCase());
    }

    private static String member;

    public static void main(String[] args) {
	SuperClass reference = new ItsTooLateToInitialize();
	reference.foo();
    }

}

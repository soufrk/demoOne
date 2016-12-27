package basics;
/**
 * Guess the compilation erros if any.
 * @author soufrk
 *
 */

// Part 1
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
		TestingClass q = new TestingClass();
		q.test(null);
	}
}

// Part 2
public class OverloadAmbiguity {
	
	public void test(String s) {
		System.out.println("String");
	}

	public void test(String ...s) {
		System.out.println("String list");
	}
	
	public void test(String[] s) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		OverloadAmbiguity q = new OverloadAmbiguity();
		q.test("Hello");
	}
}
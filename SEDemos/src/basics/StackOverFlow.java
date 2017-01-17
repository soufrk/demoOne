package basics;

/**
 * Such a harmless piece of code.
 * @author soufrk
 *
 */
public class StackOverFlow {

	public static void main(String[] args) {
		Test t = new Test();
		t.str = "Hello";
		System.out.println(t.str);
	}

}

class Test{
	String str;
	Test t = new Test();
}

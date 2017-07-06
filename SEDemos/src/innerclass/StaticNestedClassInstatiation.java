package innerclass;

/**
 * One of these is a correct way to instantiate a static-nested class.
 * @author souvik.goswami
 *
 */
public class StaticNestedClassInstatiation {

	public static void main(String[] args) {
		// 1.
		StaticNestedClassInstatiation.MyClass objA = new StaticNestedClassInstatiation().MyClass();
		// 2.
		StaticNestedClassInstatiation.MyClass objB = StaticNestedClassInstatiation.new MyClass();
		// 3.
		StaticNestedClassInstatiation.MyClass objC = new StaticNestedClassInstatiation.MyClass();
		// 4.
		StaticNestedClassInstatiation outer = new StaticNestedClassInstatiation();
		StaticNestedClassInstatiation.MyClass inner = outer.new MyClass();
	}
	
	static class MyClass{}

}

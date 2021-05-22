package exceptions;

/**
 * Which order do resources in try-with-resource block get closed ?
 * 
 * If closing one resource encounters problem, do others get closed ?
 * 
 * try-with-resources
 * 
 * @author soufrk
 *
 */
public class OrderOfClosingResources {

	public static void main1(String[] args) {
		try (MyClass01 a = new MyClass01(); 
				MyClass02 b = new MyClass02(); 
				MyClass03 c = new MyClass03()) {
		}
	}

	public static void main(String[] args) {
		try (MyClass03 c = new MyClass03(); 
				MyClass01 a = new MyClass01();) {
			throw new IllegalArgumentException();
		}
	}

}

class MyClass01 implements AutoCloseable {

	@Override
	public void close() throws NullPointerException {
		System.out.println("Closing A");
	}
}

class MyClass02 implements AutoCloseable {

	@Override
	public void close() throws NullPointerException {
		System.out.println("Closing B");
		throw new NullPointerException();
	}
}

class MyClass03 extends MyClass02 {

//	@Override
//	public void close() {
//		System.out.println("Closing C");
//	}
}
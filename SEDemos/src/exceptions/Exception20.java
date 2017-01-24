package exceptions;

import java.io.IOException;

/**
 * try-with-resources
 * @author soufrk
 *
 */
public class Exception20 {

	public static void main(String[] args) {
		try(MyClass01 a = new MyClass01();
				MyClass02 b = new MyClass02()){
		}
	}

}

class MyClass01 implements AutoCloseable{

	@Override
	public void close() throws NullPointerException {
		System.out.println("Closing A");
	}
}

class MyClass02 implements AutoCloseable{

	@Override
	public void close() throws NullPointerException {
		System.out.println("Closing B");
	}
}
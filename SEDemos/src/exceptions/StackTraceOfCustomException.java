package exceptions;

/**
 * What will stack-trace information of a custom-exception look like ?
 * 
 * @author soufrk
 *
 */
public class StackTraceOfCustomException extends Exception {

	public StackTraceOfCustomException(String message) {
		super(message);
	}

	public static void main(String[] args) throws MyException {
		throw new MyException();

	}

	public static class MyException extends StackTraceOfCustomException {
		public MyException() {
			super("Ooo111oo");
		}
	}

}

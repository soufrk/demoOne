package exceptions;

/**
 * To observe the stack-trace info.
 * @author soufrk
 *
 */
public class Exception02 extends Exception{
	
	public Exception02(String message){
		super(message);
	}

	public static void main(String[] args) throws MyException {
		throw new MyException();

	}
	
	public static class MyException extends Exception02{
		public MyException(){
			super("Ooo111oo");
		}
	}

}

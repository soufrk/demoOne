package exceptions;

/**
 * What will stack-trace information of a custom-exception look like ?
 * 
 * @author soufrk
 *
 */
public class Exception02 extends Exception {

    public Exception02(String message) {
	super(message);
    }

    public static void main(String[] args) throws MyException {
	throw new MyException();

    }

    public static class MyException extends Exception02 {
	public MyException() {
	    super("Ooo111oo");
	}
    }

}

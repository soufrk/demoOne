package exceptions;

/**
 * Use of String argument Exception constructor.
 * @author soufrk
 *
 */
public class Exception06 extends Exception{

	public static void main(String[] args) throws Exception06 {
		throw new Exception06("This is the message");
	}

	public Exception06(String message){
		super(message);
	}
}
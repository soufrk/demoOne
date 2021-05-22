package exceptions;

/**
 * Exception and Error have different hierarchy.
 * 
 * @author soufrk
 *
 */
public class ErrorVsException {

	public static void main(String[] args) {
		try {
			throw new StackOverflowError();
		} catch (Exception e) {
			System.out.println("Caught in fisrt");
		} catch (Throwable e) {
			System.out.println("Caught in second");
		}
	}

}

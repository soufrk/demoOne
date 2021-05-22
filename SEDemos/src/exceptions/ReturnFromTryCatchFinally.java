package exceptions;

/**
 * Different return options in try-catch-finally block.
 * Predict the output.
 * 
 * @author soufrk
 *
 */
public class ReturnFromTryCatchFinally {

	public static void main(String[] args) {
		System.out.println(getNumber());
	}

	public static int getNumber() {
		try {
			int i = 1 / 0;
			return -1;
		} catch (Exception e) {
			return 0;
		} finally {
			return 1;
		}
		return 2;
	}

}

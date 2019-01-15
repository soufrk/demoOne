package exceptions;

/**
 * Guess the output or exception.
 * 
 * @author soufrk
 *
 */
public class ReturnWithException {

    public static void main(String[] args) {
	System.out.println(getNextNumber(0));

    }
    
    private static int getNextNumber(int number) {
	int result = -1;
	try {
	    result = number + 1;
	    number = number / 0;
	} catch(Exception e) {
	    throw e;
	} finally {
	    return result;
	}
    }

}

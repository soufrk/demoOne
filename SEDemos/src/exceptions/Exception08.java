package exceptions;

/**
 * Demonstrates the combination of catch hierarchy.
 * 
 * @author soufrk
 *
 */
public class Exception08 {

    public static void main(String[] args) {
	try {
	    int x = 0;
	    int y = 5 / x;
	} catch (Throwable ae) {
	    System.out.println(" Throwable");
	} catch (Exception e) {
	    System.out.println(" Exception");
	} catch (RuntimeException ae) {
	    System.out.println(" Runtime Exception");
	} catch (ArithmeticException ae) {
	    System.out.println(" Arithmetic Exception");
	}
	System.out.println("finished");

    }

}

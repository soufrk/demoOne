package exceptions;

/**
 * Demonstrates the combination of catch hierarchy.
 * @author souvik.goswami
 *
 */
public class Exception08 {

	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 5 / x;
		} /*catch (Throwable ae) {
			System.out.println(" Arithmetic Exception");
		}*/ /*catch (Exception e) {
			System.out.println("Exception");
		}*/ catch (ArithmeticException ae) {
			System.out.println(" Arithmetic Exception");
		} catch (RuntimeException ae) {
			System.out.println(" Runtime Exception");
		}
		System.out.println("finished");

	}

}

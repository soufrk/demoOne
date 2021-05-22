package exceptions;

/**
 * What are the differences between the ways
 * of throwing an Exception
 * 
 * @author soufrk
 *
 */
public class ChainedExceptionOverwriteCause {

	public static void main(String[] args) throws Throwable {
		try {
			throw new IndexOutOfBoundsException();
		} catch (Exception e) {
			RuntimeException r = new RuntimeException(e);
			r.initCause(e);
			throw r;
		} catch (Exception e) {
			RuntimeException r = new RuntimeException();
			r.initCause(e);
			throw r;
		} catch (Exception e) {
			throw new RuntimeException().initCause(e);
		}
	}

}

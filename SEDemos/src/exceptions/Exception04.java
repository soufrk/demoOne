package exceptions;

import java.io.IOException;

/**
 * Re-throwing exceptions with more inclusive type-checking.
 * 
 * @author soufrk
 *
 */
public class Exception04 {

    public void method() throws Exception {
	try {
	    rethrowException("First");
	    throw new IOException();
	    // throw new InterruptedException();
	} catch (Exception e) {
	    throw e;
	}
    }

    static class FirstException extends Exception {
    }

    static class SecondException extends Exception {
    }

    public void rethrowException(String exceptionName) throws FirstException, SecondException {
	try {
	    if (exceptionName.equals("First")) {
		throw new FirstException();
	    } else {
		throw new SecondException();
	    }
	} catch (Exception e) {
	    throw e;
	}
    }

}

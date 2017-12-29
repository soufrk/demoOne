package exceptions;

/**
 * Guess which exception should be anticipated.
 * 
 * @author soufrk
 *
 */
public class ChainedExceptionOverwriteCause {

    public static void main(String[] args) {
	try{
	    throw new IndexOutOfBoundsException();
	} catch(Exception e){
	    RuntimeException r = new RuntimeException(e);
	    r.initCause(e);
	    throw r;
	}
    }

}

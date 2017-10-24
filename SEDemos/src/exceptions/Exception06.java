package exceptions;

import java.io.IOException;

/**
 * Guess what happens next !!
 * 
 * @author soufrk
 *
 */
public class Exception06 {

    public static void main1(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException | ClassCastException e) {
	    e = new IOException();
	    throw e;
	}
    }
    
    public static void main(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException e) {
	    e = new IOException();
	    throw e;
	}
    }
}

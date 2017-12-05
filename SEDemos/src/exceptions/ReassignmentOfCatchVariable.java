package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Guess what happens next !!
 * 
 * @author soufrk
 *
 */
public class ReassignmentOfCatchVariable {

    public static void main1(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException | ClassCastException e) {
	    e = new ClassCastException();
	    throw e;
	}
    }
    
    public static void main2(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException | ClassCastException e) {
	    e = new IOException();
	    throw e;
	}
    }
    
    public static void main3(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException e) {
	    e = new NullPointerException();
	    throw e;
	}
    }
    
    public static void main4(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException e) {
	    e = new FileNotFoundException();
	    throw e;
	}
    }
    
    public static void main5(String[] args) throws Exception {
	try {
	    throw new IOException();
	} catch (IOException e) {
	    e = new IOException();
	    throw e;
	}
    }
}

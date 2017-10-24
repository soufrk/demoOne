package exceptions;

import java.io.IOException;

/**
 * So, you think try-finally block works without a fuss.
 * 
 * @author soufrk
 *
 */
public class Exception01 {

    public static void main1(String[] args) {
	try {
	    System.out.println("See");
	} finally {
	    System.out.println("This works.");
	}
    }
    
    public static void main2(String[] args) {
	try {
	    System.out.println("And");
	    throw new IOException();
	} finally {
	    System.out.println("This works as well.");
	}
    }
    
    public static void main3(String[] args) {
	try {
	    System.out.println("But");
	    throw new NullPointerException();
	} finally {
	    System.out.println("Will this work ?");
	}

    }

}

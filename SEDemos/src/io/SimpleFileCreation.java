package io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Basic file operation, using low-level classes.
 * 
 * @author soufrk
 *
 */
public class SimpleFileCreation {

    public static void main(String[] args) {

	try {
	    File file = new File("test.txt"); // doesn't really create a file.
	    System.out.println(file.exists());
	    // file.createNewFile();
	    PrintStream out = new PrintStream("test.txt");
	    out.print("\nghygf");
	    out.close();

	    // So how do we open a file to append?

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}

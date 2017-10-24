package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Only way to print Unicode character.
 * 
 * @author soufrk
 *
 */
public class PrintUnicodeCharacters {

    public static void main(String[] args) {
	try {
	    char[] toWirte = { 913, 914, 915, 916 };
	    OutputStream out = new BufferedOutputStream(new FileOutputStream("test.txt"));
	    out.write(new String(toWirte).getBytes("UTF-16"));
	    System.out.println("\u00a5 123");
	    // System.out.p
	    // OutputStreamWriter writer = new OutputStreamWriter(out);

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}

package io.readwriteoperations;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Calling close() method on a BufferedReader instance closes underlying streams
 * as well.
 * 
 * @author soufrk
 *
 */
public class ClosingBufferedReader {

    public static void main(String[] args) {
	InputStream in = null;
	Reader reader = null;
	BufferedReader br = null;
	try {
	    in = new FileInputStream("test.html");
	    reader = new InputStreamReader(in);
	    br = new BufferedReader(reader);
	    br.close();
	    System.out.println(reader.read());
	    System.out.println(in.read());
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {

	}
    }

}

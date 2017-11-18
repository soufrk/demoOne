package io.readwriteoperations;

import java.io.Console;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Sample use of Console class. To be executed from cmd/terminal. How to read
 * password.
 * 
 * @author soufrk
 *
 */
public class UsingConsoleClass {

    public static void main1(String[] args) {
	String name = "";
	Console c = System.console();
	char[] pw;
	pw = c.readPassword("%s", "pw: ");
	for (char ch : pw) {
	    c.format("%c", ch);
	}
    }

    public static void main(String[] args) {
	Console console = null;
	String name = null;

	try {
	    // creates a console object
	    console = System.console();

	    // if console is not null
	    if (console != null) {

		// read line from the user input
		name = console.readLine("Name: ");

		// prints
		System.out.println("Name entered : " + name);
	    }
	} catch (Exception ex) {

	    // if any error occurs
	    ex.printStackTrace();
	}
    }
}

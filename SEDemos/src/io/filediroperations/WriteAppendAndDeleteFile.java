package io.filediroperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Append, Read & Write operations using PrintStream, Reader & Writer classes.
 * 
 * @author soufrk
 *
 */
public class WriteAppendAndDeleteFile {

    public static void main(String[] args) {
	createNewFileAndWrite();
	appendContentInFile();
	readFile();
	deleteTheFile();
    }

    /**
     * Appending file with a PrintStream.
     * 
     * @param args
     */
    private static void createNewFileAndWrite() {
	try {
	    // File file = new File("test.txt");
	    // System.out.println(file.exists());
	    // file.createNewFile();
	    PrintStream out = new PrintStream("test.txt"); // Opens file with
							   // truncation.
	    // out.print("\nghygf");
	    out.append("\nA");
	    out.close();

	    // So how do we open a file to append?

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    /**
     * Appending files using FileWriter.
     * 
     * @param args
     */
    private static void appendContentInFile() {
	try {
	    FileWriter writer = new FileWriter("test.txt", true);
	    writer.append("\nB");
	    // writer.write("C");
	    writer.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    /**
     * Reading using FileReader.
     * 
     * @param args
     */
    private static void readFile() {
	try {
	    // File file = new File("test.txt");
	    // System.out.println(file.exists());
	    // file.createNewFile();
	    FileReader in = new FileReader("test.txt");
	    int ch;
	    while ((ch = in.read()) != -1) {
		System.out.print((char) ch);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    /**
     * Deleting a file.
     * 
     * @param args
     */
    private static void deleteTheFile() {
	try {
	    File file = new File("test.txt");
	    file.delete();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}

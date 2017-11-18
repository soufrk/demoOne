package io.filediroperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Listing files/directories under one directory in old-school (io) style.
 * 
 * @author soufrk
 *
 */
public class WhatHappensIfPwdWrite {

    private static File FILE = new File("./");
    private static String TEMP_FILE = "temp.txt";

    public static void main(String args[]) {
	listPwd();
	createPwdByFileWriter();
    }

    public static void listPwd() {
	System.out.println(FILE.getAbsoluteFile());
	File[] dirs = FILE.listFiles();
	for (File dir : dirs) {
	    if (dir.isDirectory())
		System.out.println(dir.getAbsolutePath());
	}
    }

    public static void createPwd() {
	// if file doesnt exists, then create it
	try {
	    if (!FILE.exists()) {
		FILE.createNewFile();
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void createPwdByFileWriter() {
	try {
	    FileWriter fw = new FileWriter(FILE.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write("ABCD");
	    bw.close();
	    System.out.println("Done");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}

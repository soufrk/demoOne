package io.filediroperations;

import java.io.File;

/**
 * Directory operations using File.
 * 
 * @author soufrk
 *
 */
public class CreatingNewDirectory {
    static String[] CURRENT_DIR = {".", "./", ".\\", ""};
    
    public static void main(String[] args) {
	readCurrentDirectory();
	createDirectory();
    }

    public static void readCurrentDirectory() {
	for (String path : CURRENT_DIR) {
	    File currentDir = new File(path);
	    System.out.println(currentDir);
	    System.out.println(currentDir.getAbsolutePath());
	}
    }
    
    public static void createDirectory() {
	try {
	    File newDir = new File(CURRENT_DIR[3] + "src/newDir");
	    //File newDir = new File(CURRENT_DIR[1] + "src/newDir");
	    System.out.println(newDir);
	    System.out.println(newDir.getAbsolutePath());
	    System.out.println("Trying to create directory !!");
	    newDir.mkdir();
	    System.out.println("Directory creation successful:" + newDir.exists());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}

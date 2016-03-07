package io;

import java.io.File;
import java.io.IOException;

/**
 * Directory operations using File.
 * @author soufrk
 *
 */
public class IO004 {
	static String []CURRENT_DIR = {".", "./", ".\\"};

	public static void main(String[] args) {
		/*for(String path:CURRENT_DIR){
			File currentDir = new File(path);
			System.out.println(currentDir);
			System.out.println(currentDir.getAbsolutePath());
			
		}*/
		
		try {
			File newDir = new File(CURRENT_DIR[1] + "src/newDir") ;
			System.out.println(newDir);
			System.out.println(newDir.getAbsolutePath());
			newDir.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//currentDir
	}

}

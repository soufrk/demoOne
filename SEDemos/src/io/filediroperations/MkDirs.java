package io.filediroperations;

import java.io.File;

/**
 * Guess which one of the inputs creates how many
 * directorties and files.
 * 
 * @author soufrk
 *
 */
public class MkDirs {

    public static void main(String[] args) {
	String[] dirs = {"/dirA", "dirB/a.txt", "dirB", "/dirA/b.txt"};
	for(String path:dirs){
	    File f = new File(path);
	    f.mkdirs();
	}
    }

}

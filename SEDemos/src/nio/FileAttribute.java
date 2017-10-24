package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/**
 * Reading file attributes.
 * 
 * @author soufrk
 *
 */
public class FileAttribute {

    public static void main1(String[] args) {
	try {
	    BasicFileAttributes basicAttrib = Files.readAttributes(Paths.get("."), DosFileAttributes.class);
	    System.out.println(basicAttrib.isDirectory());
	    System.out.println(basicAttrib.creationTime());
	    System.out.println(basicAttrib.lastAccessTime());
	    System.out.println(basicAttrib.lastModifiedTime());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {
	try {
	    // BasicFileAttributeView basicAttrib =
	    // Files.getFileAttributeView(Paths.get("."),
	    // BasicFileAttributeView.class);
	    DosFileAttributeView basicAttrib = Files.getFileAttributeView(Paths.get("."), DosFileAttributeView.class);

	    // System.out.println(basicAttrib.);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}

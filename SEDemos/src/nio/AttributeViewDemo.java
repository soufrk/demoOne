package nio;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

/**
 * Does POSIX-attribute-view work on Windows ? Does DOS-attribute-view work on
 * Linux ?
 * 
 * @author soufrk
 *
 */
public class AttributeViewDemo {

    public static void main(String[] args) {
	Path path = Paths.get(".");
	try {
	    BasicFileAttributes basicAttrib = Files.getFileAttributeView(Paths.get("."), BasicFileAttributeView.class)
		    .readAttributes();
	    System.out.println(basicAttrib.creationTime());
	    DosFileAttributes dosAttrib = Files.getFileAttributeView(path, DosFileAttributeView.class).readAttributes();
	    System.out.println(dosAttrib.creationTime());
	    PosixFileAttributes posixAttrs = Files
		    .getFileAttributeView(path, PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS)
		    .readAttributes();
	    System.out.println(posixAttrs.creationTime());
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}

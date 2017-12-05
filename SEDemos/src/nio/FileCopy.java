package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Files.copy()
 * <ul>
 * <li>with simple paths compiles and executes nothing.</li>
 * <li>only with actual source path, creates copy.</li>
 * <li>if source is directory, creates a blank directory with destination
 * name.</li>
 * <li>if source is file, creates a blank directory with destination name.</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class FileCopy {

    public static void main1(String[] args) {
	Path path = Paths.get("testDir");
	Path emptyDest = Paths.get("dest1");
	try {
	    Files.copy(path, emptyDest, StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void main2(String[] args) {
	Path path = Paths.get("testDir", "a.txt");
	Path emptyDest = Paths.get("dest1");
	try {
	    Files.copy(path.toAbsolutePath(), emptyDest, StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}

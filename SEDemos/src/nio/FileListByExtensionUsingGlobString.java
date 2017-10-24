package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Simple demonstartion of DirectoryStream class. Lists all files in a
 * directory with the file size.
 * 
 * @author soufrk
 *
 */
public class FileListByExtensionUsingGlobString {

    public static void main(String[] args) {
	String path = "C:/myfolder/subfolder/test";
	try {
	    DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(path), "*.{mp4,MP4}");
	    for (Path temp : stream) {
		System.out.println("" + temp.getFileName() + "|" + Files.size(temp));
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}

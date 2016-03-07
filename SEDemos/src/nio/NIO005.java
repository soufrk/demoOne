package nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Creating file/dir NIO style.
 * @author soufrk
 *
 */
public class NIO005 {

	public static void main(String[] args) {
		/*Path path = Paths.get(".");
		System.out.println(path.toAbsolutePath());*/
		
		/*File file = new File("/");
		System.out.println(file.getAbsolutePath());*/
		
		try {
			Path dir = Paths.get("newDir/innerDir");
			Path file = Paths.get("newDir/innerDir/test.txt");
			Files.createDirectories(dir);
			Files.createFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

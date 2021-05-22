package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Use of glob strings in DirectoryStream to list files with a particular
 * extension.
 * 
 * @author soufrk
 *
 */
public class DirectoryStreamUseOfGlob {

	public static void main(String[] args) {

		Path path = Paths.get(".");
		String[] simpleExtensions = { "*.txt", "*.java" };
		String[] multipleExtensions = { "*.htm,*.txt", "*.{java,txt}" };
		String[] nameAndExtension = { "intel*.txt" };

		/* Single extension blob. */
		printDir(path.toAbsolutePath(), simpleExtensions[0]);
		printDir(path.toAbsolutePath(), simpleExtensions[1]);

		/* Compiles and executes without any output */
		printDir(path.toAbsolutePath(), multipleExtensions[0]);
		/* Multiple extensions */
		// try(DirectoryStream<Path> myStream =
		// Files.newDirectoryStream(path.toAbsolutePath(), )){

		/* Name matching pattern */
		// try(DirectoryStream<Path> myStream =
		// Files.newDirectoryStream(path.toAbsolutePath(), "intel*.txt")){

		/* Name and extension match. */

	}

	public static void printDir(Path path, String glob) {
		try (DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), glob)) {
			for (Path myPath : myStream)
				System.out.println(myPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

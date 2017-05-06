package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Use of blob strings in DirectoryStream to list files with a particular extension. 
 * @author soufrk
 *
 */
public class DirStream {

	public static void main(String[] args) {

		Path path = Paths.get("testDir");
		/* Single extension blob. */
		//try(DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), "*.txt")){
		//try(DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), "*.java")){
		
		/* Compiles and executes without any output */
		//try(DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), "*.java,*.txt")){
		
		/* Multiple extensions */
		//try(DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), "*.{java,txt}")){
		
		/* Name matching pattern */
		//try(DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), "intel*.txt")){
		
		/* Name and extension match. */
		try(DirectoryStream<Path> myStream = Files.newDirectoryStream(path.toAbsolutePath(), "intel*.txt")){
			for(Path myPath:myStream)
				System.out.println(myPath);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}

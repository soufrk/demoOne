package test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

/**
 * For all files in given directory,
 * convert tabs to 4 space.
 * 
 * @author soufrk
 *
 */
public class TabsToSpace {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\MANALI\\Desktop");
		String glob = "*.java";
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, glob);
		Iterator<Path> fileIterator = directoryStream.iterator();
		while(fileIterator.hasNext()) {
			covertTabs(fileIterator.next());
		}
	}

	private static void covertTabs(Path next) throws IOException {
		BufferedInputStream bs = new BufferedInputStream(Files.newInputStream(next, StandardOpenOption.READ));
		System.out.format("===Filename:%-20s===\n", next.getFileName());
		StringBuilder contents = new StringBuilder();
		int read = -1, line = 0, column = 0;
		do {
			read = bs.read();
			switch(read) {
			case '\t':
				System.out.format("Tab at line:%d, column:%d\n", line, column);
				break;
			case '\n':
				column = 0;
				line++;
				break;
			default:
				column++;
			}
			if(read == '\t') {
				System.out.println("Space");
			}
		} while(read> -1);
	}

}

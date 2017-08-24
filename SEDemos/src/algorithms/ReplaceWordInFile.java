package algorithms;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Replaces all occurrences of a word in a text file, using Java 7 NIO.
 * 
 * @author soufrk
 *
 */
public class ReplaceWordInFile {

    public static void main(String[] args) throws IOException {
	Path path = Paths.get("input.txt");
	Path output = Paths.get("output.txt");
	Charset charset = StandardCharsets.UTF_8;

	String content = new String(Files.readAllBytes(path), charset);
	content = content.replaceAll("List", "Lsit");
	Files.write(output, content.getBytes(charset));
    }

}

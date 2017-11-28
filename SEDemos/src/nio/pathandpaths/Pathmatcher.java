package nio.pathandpaths;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * Similar to Regex, some common rules for PathMatcher glob string.
 * <ul>
 * <li>* It matches zero , one or more than one characters. 
 * While matching, it will not cross directories boundaries.</li>
 * <li>** It does the same as * but it crosses the directory boundaries.</li>
 * <li>? It matches only one character for the given name.</li>
 * <li>\ It helps to avoid characters to be interpreted as special characters.</li>
 * <li>[] In a set of characters, only single character is matched. 
 * If (-) hyphen is used then, it matches a range of characters. 
 * Example: [efg] matches "e","f" or "g" . [a-d] matches a range from a to d.</li>
 * <li>{} It helps to matches the group of sub patterns.</li> 
 * </ul>
 * @author soufrk
 *
 */
public class Pathmatcher {

	public static void main(String[] args) {
		FileSystem fSystem = FileSystems.getDefault();
		PathMatcher pMatcher = fSystem.getPathMatcher("glob:*.java");
		
		Path path1 = Paths.get("Abc.java");
		System.out.println(pMatcher.matches(path1));

	}

}

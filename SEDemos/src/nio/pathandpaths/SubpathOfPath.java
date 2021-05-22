package nio.pathandpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Various demonstartions with subpath() method.
 * 
 * @author soufrk
 *
 */
public class SubpathOfPath {
	static final Path PATH = Paths.get("A/B/C/D/E/F/G");

	/* Positive examples. Guess the ouput. */
	public static void main(String[] args) {
		System.out.println(PATH.subpath(0, 1));
		System.out.println(PATH.subpath(0, 2));
		System.out.println(PATH.subpath(0, 7));
		System.out.println(PATH.subpath(0, 6));
	}

	/* Negative examples. Guess the exception */
	public static void main2(String[] args) {
		// System.out.println(PATH.subpath(0, 0));
		// System.out.println(PATH.subpath(-1, 0));
		// System.out.println(PATH.subpath(0, -1));
		// System.out.println(PATH.subpath(1, 0));
		System.out.println(PATH.subpath(0, 8));
	}

}

package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Resolve and Relativizing paths.
 * @author soufrk
 *
 */
public class NIO004 {

	public static void main(String[] args) {
		Path rootPath = Paths.get("/");
		Path child1 = Paths.get("/child1/");
		Path child2 = Paths.get("/child2/");
		
		System.out.println(rootPath.resolve(child1));
		System.out.println(child1.resolve(rootPath));
		System.out.println(child1.resolve(child2));
		System.out.println(child1.resolve(""));
		//System.out.println(child1.resolve(null));
		System.out.println("--------------------------------");
		System.out.println(rootPath.relativize(child1));
		System.out.println(child1.relativize(rootPath));
		System.out.println(child1.relativize(child2));

	}

}

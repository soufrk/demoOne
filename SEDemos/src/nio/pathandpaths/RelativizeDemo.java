package nio.pathandpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Relativize example with explanation.
 * @author soufrk
 *
 */
public class RelativizeDemo {

	public static void main(String[] args) {
		Path a = Paths.get("A");
		Path b = Paths.get("B");
		Path c = Paths.get("/").toAbsolutePath();
		Path d = Paths.get("/D");
		Path e = Paths.get("/E");
		Path f = Paths.get("A").toAbsolutePath();
		
		/* Where this path and the given path do not have a root component, then a relative path can be constructed. */
		System.out.println(a.relativize(b));
		
		/* A relative path cannot be constructed if only one of the paths have a root component. */
		System.out.println(c.relativize(a));
		System.out.println(a.toAbsolutePath().relativize(b));
		
		/* Where both paths have a root component then it is implementation dependent if a relative path can be constructed. */
		System.out.println(a.toAbsolutePath().relativize(b.toAbsolutePath()));
		System.out.println(a.toAbsolutePath().relativize(c));
		System.out.println(c.relativize(a.toAbsolutePath()));
		System.out.println(d.relativize(e));
		
		/* If this path and the given path are equal then an empty path is returned. */
		System.out.println(a.toAbsolutePath().relativize(f));

	}

}

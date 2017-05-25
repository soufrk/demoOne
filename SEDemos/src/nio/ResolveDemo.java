package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Resolve example with explanation.
 * @author soufrk
 *
 */
public class ResolveDemo {
	
	public static void main(String[] args) {
		Path a = Paths.get("A");
		Path b = Paths.get("B");
		Path c = Paths.get("");
		Path d = Paths.get("/D"); 
		
		/* 1. If other is an empty path then this method trivially returns this path */
		System.out.println(a.resolve(c));
		
		/* 2. Otherwise this method considers this path to be a directory and resolves 
		 * the given path against this path. 
		 */
		
		/* 2.A In the simplest case, the given path does not have a root component, in 
		 * which case this method joins the given path to this path and returns a 
		 * resulting path that ends with the given path. 
		 */
		System.out.println(a.resolve(b));
		/* 2.B Where the given path has a root component then resolution is highly 
		 * implementation dependent and therefore unspecified. 
		 */
		System.out.println(a.resolve(d));

	}
	
}

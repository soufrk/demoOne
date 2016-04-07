package generics;

import java.util.ArrayList;

/**
 * Generic and specific type have same class type. In other words, specific
 * belong to the same class as that of their generic.
 * 
 * @author soufrk
 *
 */
public class Gen010 {

	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = ArrayList.class;
		System.out.println(c1 == c2);

	}

}

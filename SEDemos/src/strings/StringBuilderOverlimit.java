package strings;

/**
 * Appending StringBuilder beyond initial size.
 * 
 * @author soufrk
 *
 */
public class StringBuilderOverlimit {
	public static void main(String[] args) {
		StringBuilder sbuilder = new StringBuilder(8);
		System.out.println(sbuilder.length());
		sbuilder.insert(0, "abcdef");
		sbuilder.append("789");
		System.out.println(sbuilder.length() + " " + sbuilder);
	}
}

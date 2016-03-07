package strings;

/**
 * Demonstrates a common mistake of variables
 * @author soufrk
 *
 */
public class String002 {

	public static void main(String[] args) {
		String s1 = "a";
        String s2 = "d";
        String s3 = s2;
        s2 = "g";
        System.out.println(s1 + s2 + s3);
	}

}

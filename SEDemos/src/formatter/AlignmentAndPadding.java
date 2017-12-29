package formatter;

/**
 * Right/Left alignment using (-) indicator.
 * 
 * @author soufrk
 *
 */
public class AlignmentAndPadding {

    public static void main(String[] args) {
	String s1 = String.format("%-15s %5s %10s\n", "----", "---", "-----");
	System.out.println(s1);
    }

}

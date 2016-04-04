package formatter;

/**
 * Attempt to print a Unicode character on console.
 * @author soufrk
 *
 */
public class Formatter004 {

	public static void main(String[] args) {
		//System.out.printf("%c", 97);
		System.out.format("%1$c", 95);
		System.out.format("%1$c", 175);
		System.out.format("%1$c", 172);
		System.out.format("%1$c", 255);
		System.out.format("%1$c", 256);
		System.out.format("%1$c", 257);
		/*
		 * Anything above 255 results in ?
		 */
	
	}

}

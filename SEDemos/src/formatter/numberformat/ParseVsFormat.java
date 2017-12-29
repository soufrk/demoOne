package formatter.numberformat;

import java.text.NumberFormat;

/**
 * parse() vs format().
 * 
 * @author soufrk
 *
 */
public class ParseVsFormat {

    public static void main(String[] args) {
	String s = "987.654321";
	double d = 987.654321d;
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(5);
	System.out.println(nf.format(d));
	try {
	    System.out.println(nf.parse(s));
	} catch (Exception e) {
	    System.out.println("Exception");
	}

    }

}

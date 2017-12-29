package formatter.numberformat;

import java.text.NumberFormat;

/**
 * parse() vs format().
 * 
 * @author soufrk
 *
 */
public class ParseVsFormat {

    public static void main1(String[] args) {
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
    
    public static void main2(String[] args) {
	String inputs[] = {"0.12345", "1.23546F"};
	NumberFormat format = NumberFormat.getInstance();
	format.setMaximumFractionDigits(2);
	for(String input:inputs){
	    try {
		System.out.println(format.parse(input));
		System.out.println(format.format(input));
	    } catch (ParseException e) {
		e.printStackTrace();
	    }
	}
    }

}

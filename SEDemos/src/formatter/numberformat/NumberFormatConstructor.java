package basics;

import java.text.NumberFormat;

/**
 * Guess the output
 * 
 * @author soufrk
 *
 */
public class NumberFormatConstructor {

    public static void main(String[] args) {
	NumberFormat formatter = NumberFormat.getInstance();
	System.out.println(formatter.format(0.02));
	System.out.println(formatter.format(1));
	System.out.println(formatter.format(0.789f));
	System.out.println(formatter.format(0L));
	System.out.println(formatter.format("0.07"));
    }

}

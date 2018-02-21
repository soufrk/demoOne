package formatter;

import java.util.Formatter;

/**
 * Yes, formatters can and need to be closed.
 * Predict what happens to this code.
 * 
 * @author soufrk
 *
 */
public class ClosingTheFormatter {

    public static void main(String[] args) {
	Formatter formatter = new Formatter();
	formatter.format("%s", "Hello World!");
	System.out.println(formatter);
	formatter.close();
	System.out.println(formatter);
    }

}

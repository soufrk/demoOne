package formatter.utilandstring;

import java.util.Formatter;

/**
 * Basic structure of formatter command.
 * 
 * %[argument_index$][flags][width]conversion_char
 * 
 * @author soufrk
 *
 */
public class WaysOfStringFormatting {

    public static void main(String[] args) {
	/*
	 * format & printf internally uses Formatter mechanism.
	 */
	StringBuilder sb = new StringBuilder();
	// Send all output to the Appendable object sb
	Formatter formatter = new Formatter(sb);
	formatter.format("%2$s %1$s", "A", "B");
	System.out.println(sb);
	System.out.printf("%2$s %1$s", "A", "B");
	System.out.format("%2$s %1$s", "A", "B");
	formatter.close();
    }

}

package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the essence of range operation - []
 * @author soufrk
 *
 */
public class UsingRange02 {
	
    public static void main(String[] args) {
	String[] inputs = { "abcd abc acd bcd abd" };
	Pattern[] patterns = new Pattern[5];
	/*
	 * Searches for either 'a' or 'b' or 'c' or 'd'
	 */
	patterns[0] = Pattern.compile("[abcd]");

	/*
	 * Searches for 'a' followed by 'b' followed by 'c' followed by 'd'.
	 */
	patterns[1] = Pattern.compile("abcd");

	/*
	 * Searches for 'a' followed by 'b' followed by either 'c' or 'd'
	 */
	patterns[2] = Pattern.compile("ab[c|d]");

	/*
	 * Searches for either 'a' followed by 'b' or, 'c' followed by 'd'
	 */
	patterns[3] = Pattern.compile("ab|cd");

	/*
	 * Equivalent of 'abcd'
	 */
	patterns[4] = Pattern.compile("[a][b][c][d]");
    }

    private static void prase(Pattern[] patterns, String[] inputs) {
	StringBuilder builder = new StringBuilder();
	for (String input : inputs) {
	    builder.append("Input: " + input + "\n");
	    builder.append("Length: " + input.length() + "\n");
	    for (Pattern p : patterns) {
		builder.append("Pattern: " + p + "\n");
		Matcher matcher = p.matcher(input);
		String output = "Found match at:[";
		while (matcher.find()) {
		    output += matcher.start() + ",";
		}
		output = output.substring(0, output.length() - 1) + "]";
		builder.append(output + "\n");
	    }
	    builder.append("\n");
	}
	System.out.println(builder.toString());
    }
}

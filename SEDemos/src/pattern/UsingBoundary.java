package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates use of ranges of pattern using [].
 * 
 * @author soufrk
 *
 */
public class UsingBoundary {

    public static void main(String[] args) {

	String[] input = { "a aa ab abc aab abb abc.", "abdc agfa cdab.", "abcd ABCD AbcD aBcD.",
		"abcd012 ABCD123 AbcD234 aBcD345." };
	Pattern[] patterns = { Pattern.compile("[a,b]"), Pattern.compile("[ab]"), Pattern.compile("[a-c]"),
		Pattern.compile("[a-bA-B]"), Pattern.compile("[a-bA-B]"), Pattern.compile("[a-b0-2]") };
	prase(patterns, input);
    }

    private static void prase(Pattern[] patterns, String[] inputs) {
	StringBuilder builder = new StringBuilder();
	for (String input : inputs) {
	    builder.append("Input: " + input + "\n");
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

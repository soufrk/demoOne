package pattern;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * If quantifiers are used inside boundary [].
 * 
 * @author soufrk
 *
 */
public class QuantifiersInBoundary {

    public static void main(String[] args) {
	String input0 = "ab abb aab aabb abbb aaab aabb";
	// String input1 = "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa";

	Pattern pattern = Pattern.compile("a+");
	System.out.println(getResult(input0, pattern, "Search for sequence with 1 or more 'a' (Any sequence of 'a')."));

	pattern = Pattern.compile("a*");
	System.out.println(getResult(input0, pattern,
		"Search for sequence with 0 or more 'a' (Either continuous or non-continuous)."));

	pattern = Pattern.compile("a?");
	System.out
		.println(getResult(input0, pattern, "Search for sequence with 1 or none 'a' (Either sigle or none)."));

	pattern = Pattern.compile("[a+]");
	System.out.println(getResult(input0, pattern, "Search for sequence with 1 or more 'a' (Any sequence of 'a')."));

	pattern = Pattern.compile("[a*]");
	System.out.println(getResult(input0, pattern,
		"Search for sequence with 0 or more 'a' (Either continuous or non-continuous)."));

	pattern = Pattern.compile("[a?]");
	System.out
		.println(getResult(input0, pattern, "Search for sequence with 1 or none 'a' (Either sigle or none)."));

	System.out.println("It's waste to use quantifiers inside boundary");
	System.out.println("Back to the question, how do we search for one and only one occurance?");

    }

    private static String getResult(String input, Pattern pattern, String desc) {
	Matcher matcher = pattern.matcher(input);
	String output = "Pattern: " + pattern.pattern() + "\nDescription: " + desc + "\nInput:" + input + "\nLength:"
		+ input.length() + "\nFound at:[";
	while (matcher.find()) {
	    output += matcher.start() + "(" + matcher.group() + "),";
	}
	output = output.substring(0, output.length() - 1) + "]\n";
	return output;
    }
}

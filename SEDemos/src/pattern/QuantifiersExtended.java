package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extended and more detailed use of quantifiers [+, *, ?]
 * 
 * @author soufrk
 *
 */
public class QuantifiersExtended {

	public static void main(String[] args) {
		String input0 = "ab abb aab aabb abbb aaab aabb";
		String input1 = "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa";

		Pattern pattern = Pattern.compile("a+");
		System.out.println(getResult(input0, pattern, "Search for sequence with 1 or more 'a' (Any sequence of 'a')."));

		pattern = Pattern.compile("a*");
		System.out.println(getResult(input0, pattern,
				"Search for sequence with 0 or more 'a' (Either continuous or non-continuous)."));

		pattern = Pattern.compile("a?");
		System.out
				.println(getResult(input0, pattern, "Search for sequence with 1 or none 'a' (Either sigle or none)."));

		// 'a'? will treat a sequence of 'a' as composed of single 'a'
		pattern = Pattern.compile("a?");
		System.out.println(getResult(input1, pattern,
				"Search for sequence with 1 or none 'a' (Even sequence is treated as composed of single 'a')."));

		System.out.println("SO HOW DO WE SEARCH FOR 1 AND ONLY 1 'a' ?");
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

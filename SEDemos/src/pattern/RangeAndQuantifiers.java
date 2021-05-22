package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Basic quantifier expressions in range operations.
 * 
 * @author soufrk
 *
 */
public class RangeAndQuantifiers {

	public static void main(String[] args) {
		String input0 = "ab abb aab aabb abbb aaab aabb";
		String input1 = "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa";

		System.out.println(getResult(input0, Pattern.compile("a"), "Search for single occurance of 'a'"));
		System.out.println(getResult(input0, Pattern.compile("aa"), "Search for two occurance of 'a', ie 'aa'"));
		// [aa] does not search for two consecutive 'a's. Because it translates to 'a'
		// or 'a', ie 'a'.
		System.out.println(
				getResult(input0, Pattern.compile("[aa]"), "Does not search for two occurance of 'a', ie 'aa'"));
		System.out.println(getResult(input1, Pattern.compile("aaaaaa"), "Search for 6 occurance of 'a', ie 'aaaaaa'"));
		System.out.println(getResult(input1, Pattern.compile("a{6}"), "Search for 6 occurance of 'a', ie 'aaaaaa'"));
		System.out.println(getResult(input1, Pattern.compile("[a]{6}"), "Search for 6 occurance of 'a', ie 'aaaaaa'"));
	}

	private static String getResult(String input, Pattern pattern, String desc) {
		Matcher matcher = pattern.matcher(input);
		String output = "Pattern: " + pattern.pattern() + "\nDescription: " + desc + "\nInput:" + input + "\nLength:"
				+ input.length() + "\nFound at:[";
		while (matcher.find()) {
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length() - 1) + "]\n";
		return output;
	}

}

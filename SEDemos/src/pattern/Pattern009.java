package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Use of an extra ?
 * Types of quantifiers - Greedy, Reluctant, Possessive
 * <p/><b>Part-I (Greedy Vs (Reluctant[Lazy]))</b></p>
 * + (Greedy) at least once.
 * +? (Reluctant[Lazy]) at most once.
 * <p/>
 * Both, search for at least single occurrence [Once OR More]. While + is more positive, +? returns as much 
 * negative as possible.
 * @author soufrk
 * @see https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 */
public class Pattern009 {
	
	public static void main(String[] args) {
		String input0 = "ab aab aabb aaab";
		String input1 = "a aa aaa aaaa";

		Pattern pattern = Pattern.compile("a+");
		System.out
				.println(getResult(input0, pattern,
						"Search for sequence with 1 or more 'a' (Any sequence of 'a')."));

		pattern = Pattern.compile("a+?");
		System.out.println(getResult(input0, pattern,
				"Possessive search for 1 or none 'a'"));

		// --------------------------------------------------------- //
		pattern = Pattern.compile("a+");
		System.out
				.println(getResult(input1, pattern,
						"Search for sequence with 1 or none 'a' (Either sigle or none)."));

		pattern = Pattern.compile("a+?");
		System.out.println(getResult(input1, pattern,
				"Possessive search for 1 or none 'a'"));

	}

	private static String getResult(String input, Pattern pattern, String desc) {
		Matcher matcher = pattern.matcher(input);
		String outputResult = "Match Result:[";
		String output = "Pattern: " + pattern.pattern() + "\nDescription: "
				+ desc + "\nInput:" + input + "\nLength:" + input.length()
				+ "\nMatch Index:[";
		while (matcher.find()) {
			output += matcher.start() + ",";
			outputResult += matcher.start() + "(" + matcher.group() + "),";
		}
		output = output.substring(0, output.length() - 1) + "]\n";
		output += outputResult;
		output = output.substring(0, output.length() - 1) + "]\n";
		return output;
	}

}

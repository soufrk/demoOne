package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Use of an extra ? Types of quantifiers - Greedy, Reluctant, Possessive
 * <p/><b>Part-I (Greedy Vs (Reluctant[Lazy]))</b></p>
 * ? (Greedy) if not once.
 * ?? (Reluctant[Lazy]) if not at most once.
 * <p/>
 * Both, search for at most(if not) single occurrence [Zero OR Once]. While ? is
 * more positive, ?? returns as much negative as possible.
 * 
 * @author soufrk
 * @see https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 *
 */
public class Pattern008 {

	public static void main(String[] args) {
		String input0 = "ab aab aabb aaab";
		// String input1 = "a aa aaa aaaa";
		String input1 = "aaaaaaaaaaaaaaaa";

		Pattern pattern = Pattern.compile("a?");
		System.out
				.println(getResult(input0, pattern, "Search for either with one or none 'a' (Either sigle or none)."));

		pattern = Pattern.compile("a??");
		System.out.println(getResult(input0, pattern, "Reluctant search for either with one or none 'a'"));

		// -------------------------------------------------------------------
		// //
		pattern = Pattern.compile("a?");
		System.out
				.println(getResult(input1, pattern, "Search for either with one or none 'a' (Either sigle or none)."));

		pattern = Pattern.compile("a??");
		System.out.println(getResult(input1, pattern, "Reluctant search for either with one or none 'a'"));

	}

	private static String getResult(String input, Pattern pattern, String desc) {
		Matcher matcher = pattern.matcher(input);
		String outputResult = "Match Result:[";
		String output = "Pattern: " + pattern.pattern() + "\nDescription: " + desc + "\nInput:" + input + "\nLength:"
				+ input.length() + "\nMatch Index:[";
		while (matcher.find()) {
			output += matcher.start() + ",";
			outputResult += matcher.start() + "(" + matcher.group() + "),";
		}
		output = output.substring(0, output.length() - 1) + "]\n";
		output += outputResult;
		output = output.substring(0, output.length() - 1) + "]\n";
		return output;
	}

	/*
	 * private static String getResultWithMatch(String input, Pattern pattern,
	 * String desc) { Matcher matcher = pattern.matcher(input); String output =
	 * "Pattern: " + pattern.pattern() + "\nDescription: " + desc + "\nInput:" +
	 * input + "\nLength:" + input.length() + "\nFound at:["; while
	 * (matcher.find()) { output += matcher.start() + "(" + matcher.group() +
	 * ")," ; } output = output.substring(0, output.length() - 1) + "]\n";
	 * return output; }
	 */

}

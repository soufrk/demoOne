package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Additional Range Operation using ^, &&.
 * 
 * @author soufrk
 *
 */
public class RangeOperations {

	public static void main(String[] args) {
		String input = "john o jo hn jon n j ohn ojhn john";

		Pattern pattern = Pattern.compile("[i-o]");
		System.out.println(getResult(input, pattern, "Search for single character matching between 'i' till 'o'"));

		pattern = Pattern.compile("[i-o&&[n]]");
		System.out.println(getResult(input, pattern,
				"Search for single character matching between 'i' till 'o'" + " intersection with 'n'"));

		pattern = Pattern.compile("[i-o&&[^n]]");
		System.out.println(getResult(input, pattern,
				"Search for single character matching between 'i' till 'o'" + " subtraction of 'n'"));
	}

	private static String getResult(String input, Pattern pattern, String desc) {
		Matcher matcher = pattern.matcher(input);
		String output = "Description: " + desc + "\nInput:" + input + "\nLength:" + input.length() + "\nFound at:[";
		while (matcher.find()) {
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length() - 1) + "]\n";
		return output;
	}

}

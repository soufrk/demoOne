package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Use of an extra ? Types of quantifiers - Greedy, Reluctant, Possessive
 * <p/>
 * <b>Part-II (Greedy Vs Possessive)</b>
 * </p>
 * ? (Greedy) if not once. ?+ (Possessive) as many if not
 * <p/>
 * Both, search for at most(if not) single occurrence [Zero OR Once]. It is
 * difficult to tell the difference between the two using a criteria that limits
 * maximum occurrences at 1.
 * 
 * @author soufrk
 * @see https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 */
public class TypesOfQuantifiers3 {

    public static void main(String[] args) {
	String input0 = "ab aab aabb aaab";
	String input1 = "a aa aaa aaaa";

	System.out.println(getResult(input0, Pattern.compile("a?"), "Search for sequence with 1 or more 'a' (Any sequence of 'a')."));
	System.out.println(getResult(input0, Pattern.compile("a?+"), "Possessive search for 1 or none 'a'"));
	System.out.println(getResult(input1, Pattern.compile("a?"), "Search for sequence with 1 or none 'a' (Either sigle or none)."));
	System.out.println(getResult(input1, Pattern.compile("a?+"), "Possessive search for 1 or none 'a'"));
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
}

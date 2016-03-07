package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Basic quantifier expressions.
 * @author soufrk
 *
 */
public class Pattern005 {

	public static void main(String[] args) {
		String input0 = "ab abb aab aabb abbb aaab aabb";
		String input1 = "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa";
		
		Pattern pattern = Pattern.compile("a");
		System.out.println(getResult(input0, pattern, 
				"Search for single occurance of 'a'"));
		
		pattern = Pattern.compile("aa");
		System.out.println(getResult(input0, pattern, 
				"Search for two occurance of 'a', ie 'aa'"));
		
		/*
		 * [aa] cannot search for two consecutive 'a's. Because it
		 * translates to 'a' or 'a', ie 'a'.
		 */
		pattern = Pattern.compile("[aa]");
		System.out.println(getResult(input0, pattern, 
				"Cannot search for two occurance of 'a', ie 'aa'"));
		
		
		pattern = Pattern.compile("aaaaaa");
		System.out.println(getResult(input1, pattern, 
				"Search for 6 occurance of 'a', ie 'aaaaaa'"));
		
		/*pattern = Pattern.compile("a{6}");
		System.out.println(getResult(input1, pattern, 
				"Search for 6 occurance of 'a', ie 'aaaaaa'"));
		
		pattern = Pattern.compile("[a]{6}");
		System.out.println(getResult(input1, pattern, 
				"Search for 6 occurance of 'a', ie 'aaaaaa'"));*/
		
	}

	private static String getResult(String input, Pattern pattern, String desc) {
		Matcher matcher = pattern.matcher(input);
		String output = "Pattern: " + pattern.pattern()
				+ "\nDescription: " + desc
				+ "\nInput:" + input
				+ "\nLength:" + input.length()
				+ "\nFound at:[";
		while (matcher.find()) {
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length() - 1) + "]\n";
		return output;
	}

}

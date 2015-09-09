package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the essence of range operation - []
 * @author souvik.goswami
 *
 */
public class Pattern003 {

	public static void main(String[] args) {
		
		String input = "abcd abc acd bcd abd";
		System.out.println("Length: " + input.length());
		/*
		 * Searches for either 'a' or 'b' or 'c' or 'd'
		 */
		//Pattern pattern = Pattern.compile("[abcd]");
		
		/*
		 * Searches for 'a' followed by 'b' followed by
		 * 'c' followed by 'd'.
		 */
		//Pattern pattern = Pattern.compile("abcd");
		
		/*
		 * Searches for 'a' followed by 'b' followed by
		 * either 'c' or 'd'
		 */
		//Pattern pattern = Pattern.compile("ab[c|d]");
		
		/*
		 * Searches for either 'a' followed by 'b' or,
		 * 'c' followed by 'd'
		 */
		//Pattern pattern = Pattern.compile("ab|cd");
		
		/*
		 * Equivalent of 'abcd'
		 */
		Pattern pattern = Pattern.compile("[a][b][c][d]");
		
		Matcher matcher = pattern.matcher(input);
		String output = "Matches found at:[";
		while(matcher.find()){
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length()-1) + "]";
		System.out.println(output);
	}

}

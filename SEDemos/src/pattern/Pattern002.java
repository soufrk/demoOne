package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates use of ranges of pattern using [].
 * @author souvik.goswami
 *
 */
public class Pattern002 {

	/*public static void main(String[] args) {
		String input = "a aa ab abc aab abb abc.";
		Pattern pattern = Pattern.compile("[a,b]");
		//Pattern pattern = Pattern.compile("[ab]");
		Matcher matcher = pattern.matcher(input);
		String output = "Found match at:[";
		while(matcher.find()){
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length()-1) + "]";
		System.out.println(output);
	}*/
	
	/*public static void main(String[] args) {
		String input = "abdc agfa cdab.";
		Pattern pattern = Pattern.compile("[a-c]");
		Matcher matcher = pattern.matcher(input);
		String output = "Found match at:[";
		while(matcher.find()){
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length()-1) + "]";
		System.out.println(output);
	}*/
	
	/*public static void main(String[] args) {
		String input = "abcd ABCD AbcD aBcD.";
		//Pattern pattern = Pattern.compile("[a-bA-B]");
		Pattern pattern = Pattern.compile("[a-bA-B]");
		Matcher matcher = pattern.matcher(input);
		String output = "Found match at:[";
		while(matcher.find()){
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length()-1) + "]";
		System.out.println(output);
	}*/
	
	public static void main(String[] args) {
		String input = "abcd012 ABCD123 AbcD234 aBcD345.";
		//Pattern pattern = Pattern.compile("[a-bA-B]");
		Pattern pattern = Pattern.compile("[a-b0-2]");
		Matcher matcher = pattern.matcher(input);
		String output = "Found match at:[";
		while(matcher.find()){
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length()-1) + "]";
		System.out.println(output);
	}

}

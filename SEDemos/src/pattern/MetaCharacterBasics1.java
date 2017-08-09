package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates use of meta-character in patterns. [d,s,w,b]
 * 
 * @author soufrk
 *
 */
public class MetaCharacterBasics1 {

    public static void main(String[] args) {
	String input = "The number was 007.";
	Pattern patternD = Pattern.compile("\\d");
	Matcher matcherD = patternD.matcher(input);
	String outputD = "Integers at:[";
	while (matcherD.find()) {
	    outputD += matcherD.start() + ",";
	}
	outputD = outputD.substring(0, outputD.length() - 1) + "]";

	Pattern patternS = Pattern.compile("\\s");
	Matcher matcherS = patternS.matcher(input);
	String outputS = "Space at:[";
	while (matcherS.find()) {
	    outputS += matcherS.start() + ",";
	}
	outputS = outputS.substring(0, outputS.length() - 1) + "]";

	Pattern patternW = Pattern.compile("\\w");
	Matcher matcherW = patternW.matcher(input);
	String outputW = "Word at:[";
	while (matcherW.find()) {
	    outputW += matcherW.start() + ",";
	}
	outputW = outputW.substring(0, outputW.length() - 1) + "]";

	Pattern patternB = Pattern.compile("\\b");
	Matcher matcherB = patternB.matcher(input);
	String outputB = "Word boundary at:[";
	while (matcherB.find()) {
	    outputB += matcherB.start() + ",";
	}
	outputB = outputB.substring(0, outputB.length() - 1) + "]";

	System.out.println(outputD);
	System.out.println(outputS);
	System.out.println(outputW);
	System.out.println(outputB);
    }

}

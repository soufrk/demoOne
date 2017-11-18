package io.readwriteoperations;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Using tokenizing power of Scanner class
 * 
 * @author soufrk
 *
 */
public class StringTokenizingUsingScanner {

    public static void main1(String[] args) {
	// DEFAULT TOKENIZING
	Scanner scanner = new Scanner("ABCDERgfdgg fdgfdg  34545 df g ");
	while (scanner.hasNext()) {
	    System.out.println(scanner.next());
	}
    }

    public static void main2(String[] args) {
	//
	Scanner scanner = new Scanner("a aa aaa aaaa");
	scanner.useDelimiter(Pattern.compile("^a*"));
	while (scanner.hasNext()) {
	    System.out.println("Match->" + scanner.next());
	}
    }

    public static void main3(String[] args) {
	Scanner scanner = new Scanner("ABCDERgfdgg|fdgfdg|34545|df|g|");
	scanner.useDelimiter(Pattern.compile("|"));
	// scanner.useDelimiter(Pattern.compile("[|]"));
	while (scanner.hasNext()) {
	    System.out.println("Match->" + scanner.next());
	}
    }

    public static void main4(String[] args) {
	Scanner scanner = new Scanner("a1 2bc 3d 4f5 g6");
	scanner.useDelimiter(Pattern.compile("\\d+"));
	// scanner.useDelimiter(Pattern.compile("[|]"));
	while (scanner.hasNext()) {
	    System.out.println("Match->" + scanner.next() + "<-");
	}
    }

}

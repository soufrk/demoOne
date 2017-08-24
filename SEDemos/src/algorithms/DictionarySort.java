package algorithms;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implementation of a dictionary like sorting of words ina given String.
 * 
 * @author soufrk
 *
 */
public class DictionarySort {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Integer numberOfStrings = scanner.nextInt();
	Set<String> setOfStrings = new TreeSet<>();
	while (numberOfStrings-- > 0) {
	    setOfStrings.add(scanner.next());
	}
	scanner.close();
	for (String temp : setOfStrings) {
	    System.out.println(temp);
	}
    }

}

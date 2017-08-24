package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the 3rd unique character in a given String.
 * 
 * @author soufrk
 *
 */
public class IndexedUniqueElementFinder {

    public static void main(String[] args) {
	String inputs[] = { "aabcd", "abcedb" };
	for (String input : inputs)
	    method1(input);
    }

    public static /* char */void method1(String input) {
	Map<Character, CharOccuranceIndex> mapOfCharacters = new HashMap<>();
	int index = 0;
	for (char ch : input.toCharArray()) {
	    if (mapOfCharacters.containsKey(ch)) {
		CharOccuranceIndex value = mapOfCharacters.get(ch);
		value.incrementOccurance();
	    } else {
		CharOccuranceIndex value = new CharOccuranceIndex(ch, index++);
		mapOfCharacters.put(ch, value);
	    }
	}
	System.out.println(mapOfCharacters + "\n" + "=======================");
    }

    private static class CharOccuranceIndex {
	char ch;
	int index;
	int occurance;

	public CharOccuranceIndex(char ch, int index) {
	    this.ch = ch;
	    this.index = index;
	    occurance = 1;
	}

	public void incrementOccurance() {
	    this.occurance++;
	}

	public boolean isUnique() {
	    return occurance > 1 ? true : false;
	}

	@Override
	public int hashCode() {
	    return ch;
	}

	@Override
	public boolean equals(Object object) {
	    boolean result = false;
	    if (this == object)
		result = true;
	    else if (this == null || object.getClass() != this.getClass()) {

	    } else {
		result = this.ch == ((CharOccuranceIndex) object).ch;
	    }
	    return result;
	}

	@Override
	public String toString() {
	    return "CharOccuranceIndex [ch=" + ch + ", index=" + index + ", occurance=" + occurance + "]\n";
	}
    }

}

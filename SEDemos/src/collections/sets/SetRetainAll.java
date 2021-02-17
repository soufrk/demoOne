package collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * How many values will remain in the Set ?
 * 
 * @author soufrk
 */
public class SetRetainAll {

	public static void main(String... args) {
		Set<Integer> setOfValues = new HashSet<>();
		setOfValues.add(1);setOfValues.add(10);

		Set<Integer> setOfCoreValues = new HashSet<>();
		setOfCoreValues.add(5);setOfCoreValues.add(6);setOfCoreValues.add(10);

		setOfValues.retainAll(setOfCoreValues);
		System.out.println("Set of Values" + setOfValues);
	}

}

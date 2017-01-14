package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Guess the output.
 * @author soufrk
 *
 */
public class TheFamousRemoveFromSet {

	public static void main(String[] args) {
		Set<Short> mySet = new HashSet<>();
		for(short i = 0; i<100 ;i++){
			mySet.add(i);
			mySet.remove(i-1);
		}
		
		System.out.println(mySet.size());
	}

}

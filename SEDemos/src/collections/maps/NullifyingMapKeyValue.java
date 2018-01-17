package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Shouldn't be too hard to guess.
 * @author soufrk
 *
 */
public class NullifyingMapKeyValue {

    public static void main(String[] args) {
	Map<Integer, Object> myMap = new HashMap<>();
	Integer key = 10;
	String value = "A";
	myMap.put(key, value);

	key = null;
	System.out.println(myMap.get(key));
	value = null;
	System.out.println(myMap.get(10));
    }

}

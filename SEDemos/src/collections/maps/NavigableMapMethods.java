package collections.maps;

import java.util.TreeMap;

public class NavigableMapMethods {

    public static void main(String[] args) {
	TreeMap<String, Integer> myMap = new TreeMap<>();
	myMap.put("A", 10);myMap.put("D", 20);myMap.put("G", 30);
	myMap.put("J", 40);myMap.put("P", 50);myMap.put("T", 60);
	// Key greater than or equal to 
	System.out.println(myMap.ceilingKey("G"));
	System.out.println(myMap.ceilingEntry("G"));
	// Strictly greater key
	System.out.println(myMap.higherKey("G"));
	System.out.println(myMap.higherEntry("G"));
	// Key less than or equal to
	System.out.println(myMap.floorKey("G"));
	System.out.println(myMap.floorEntry("G"));
	// Strictly lesser key
	System.out.println(myMap.lowerKey("G"));
	System.out.println(myMap.lowerEntry("G"));
	// Remove first
	System.out.println(myMap.pollFirstEntry());
	// Remove last
	System.out.println(myMap.pollLastEntry());
	// Descending key-set
	System.out.println(myMap.descendingKeySet());
	// Descending map
	System.out.println(myMap.descendingMap());
    }

}

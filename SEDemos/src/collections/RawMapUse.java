package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Can raw map be used in combination of various types for key & value classes.
 * 
 * What about TreeMap then ?
 * 
 * @author soufrk
 *
 */
public class RawMapUse {

    public static void main1(String[] args) {
	Map myMap = new HashMap();
	myMap.put(1, "A");
	myMap.put("B", 2);
	System.out.println(myMap);
	System.out.println(myMap.get(1).getClass());
	System.out.println(myMap.get("B").getClass());
    }

    public static void main2(String[] args) {
	Map myMap = new TreeMap();
	myMap.put(1, "A");
	myMap.put("B", 2);
	System.out.println(myMap);
	System.out.println(myMap.get(1).getClass());
	System.out.println(myMap.get("B").getClass());
    }

}

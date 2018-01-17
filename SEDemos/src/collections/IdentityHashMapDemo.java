package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {
	Map<String, String> mapOne = new IdentityHashMap<>();
	Map<String, String> mapTwo = new HashMap<>();
	String a = "A";
	String b = "A";
	String c = new String("A");
	mapOne.put(a, "One");
	mapOne.put(b, "Two");
	mapOne.put(c, "Three");
	mapTwo.put(a, "One");
	mapTwo.put(b, "Two");
	mapTwo.put(c, "Three");
	System.out.println(mapOne.size());
	System.out.println(mapTwo.size());
    }

}

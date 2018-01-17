package collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Behaviour of map, when using custom class as Map key.
 * @author soufrk
 *
 */
public class UsingCustomClassAsMapKey {

    public static void main2(String[] args) {
	// A map with mutable key.
	Map<MyClass, Object> myMap = new HashMap<>();
	// Create a mutable object.
	MyClass object = new MyClass(1, "A");
	String value = "A";
	// Put instance in map as key.
	myMap.put(object, value);
	// Nullify instance reference.
	object = null;
	// Fetch from map by reference.
	System.out.println(myMap.get(object));
	// Print the map.
	System.out.println(myMap);
	// Create a similar instance as above.
	MyClass newObject = new MyClass(1, "A");
	// Fetch from map by new instance.
	System.out.println(myMap.get(newObject));
    }

    static class MyClass {
	int id;
	String name;

	public MyClass(int id, String name) {
	    super();
	    this.id = id;
	    this.name = name;
	}

	@Override
	public String toString() {
	    return "MyClass [id=" + id + ", name=" + name + "]";
	}
    }

}

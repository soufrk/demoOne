package collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Importance of immutability of a class, when used with collections.
 * 
 * @author soufrk
 *
 */
public class MutableObjectInMapVsList {

    /*
     * Let's start with primitive key in a map.
     * How many entries are there in the map ?
     */
    public static void main1(String[] args) {
	Map<Integer, String> myMap = new HashMap<>();
	Integer i = 10;
	String s = "A";
	myMap.put(i, s);
	i = 11;
	s = "B";
	myMap.put(i, s);
	System.out.println(myMap);
    }
    
    /*
     * Now if we have a custom class as key.
     * How many entries are there in the map ?
     */
    public static void main2(String[] args) {
	Map<Integer, MyClass> myMap2 = new HashMap<>();
	Integer key = 10;
	MyClass value = new MyClass(1);
	myMap2.put(key, value);
	value.setId(2);
	key = 11;
	myMap2.put(key, value);
	value.setId(13);
	//System.out.println(myMap2);
    }
    
    /*
     * Considering HashMap is an identity based collection,
     * what will be the behaviour on LinkedList
     */
    public static void main3(String[] args) {
	List<MyClass> myList = new LinkedList<>();
	MyClass listItem = new MyClass(1);
	myList.add(listItem);
	System.out.println("Before modifying:" + myList);
	listItem.setId(11);
	System.out.println("After modifying:" + myList);
    }
    
    /*
     * What if same object reference is inserted multiple
     * times in a list, and then the reference be mutated.
     */
    public static void main(String[] args) {
	List<MyClass> myList = new LinkedList<>();
	MyClass listItem = new MyClass(1);
	System.out.println("Empty list to begin:" + myList);
	listItem.setId(1);
	for (int i = 0; i < 3; i++) {
	    myList.add(listItem);
	}
	System.out.println("After adding multiple entries:\n" + myList);
	listItem.setId(11);
	System.out.println("After mutating the reference:\n" + myList);
    }
    
    
    static class MyClass {
	    int id;

	    public MyClass(int id) {
		super();
		this.id = id;
	    }

	    @Override
	    public String toString() {
		return "MyClass [id=" + id + "]";
	    }

	    public int getId() {
		return id;
	    }

	    public void setId(int id) {
		this.id = id;
	    }
	}

}

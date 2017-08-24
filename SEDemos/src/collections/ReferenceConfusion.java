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
public class ReferenceConfusion {

    public static void main(String[] args) {

	List<Integer> myList = new LinkedList<>();
	Integer integer = null;
	for (int i = 0; i < 10; i++) {
	    integer = i;
	    myList.add(i);
	}
	System.out.println(myList);

	Map<Integer, String> myMap = new HashMap<>();
	Integer i = 10;
	String s = "A";
	myMap.put(i, s);
	i = 11;
	s = "B";
	myMap.put(i, s);
	System.out.println(myMap);

	class MyClass {
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

	Map<Integer, MyClass> myMap = new HashMap<>();
	Integer i = 10;
	MyClass s = new MyClass(1);
	myMap.put(i, s);
	s.setId(2);
	i = 11;
	myMap.put(i, s);
	s.setId(13);
	System.out.println(myMap);

	List<MyClass> myList = new LinkedList<>();
	MyClass s = new MyClass(1);
	for (int i = 0; i < 10; i++) {
	    myList.add(s);
	}
	System.out.println(myList);
	s.setId(11);
	System.out.println(myList);
    }

}

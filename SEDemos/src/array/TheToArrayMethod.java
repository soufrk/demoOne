package array;

import java.util.LinkedList;
import java.util.List;

/**
 * Given that something is going to blow up !!
 * Predicting what, will really be tough.
 * 
 * @author soufrk
 *
 */
public class TheToArrayMethod {

    public static void main(String[] args) {
	List<Integer> myList = new LinkedList<>();
	myList.add(10);
	myList.add(20);
	myList.add(30);
	    
	Object[] objArray = new Object[5];
	String[] strArray = new String[5];
	Object[] objStr = new String[5];
	Object[] objInt = new Integer[5];
	Integer[] intArray = new Integer[5];

	System.out.println((myList.toArray(objArray)).getClass());
	System.out.println((myList.toArray(strArray)).getClass());
	System.out.println((myList.toArray(objStr)).getClass());
	System.out.println((myList.toArray(objInt)).getClass());
	System.out.println((myList.toArray(intArray)).getClass());
    }

}

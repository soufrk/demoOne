package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * So let's create a list from an Array. Or shall we ??
 * 
 * @author soufrk
 *
 */
public class TheArraysAsListMethod {

    public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5 };
	List myList = Arrays.asList(arr);

	Iterator<Object> itr = myList.iterator();
	while (itr.hasNext())
	    System.out.println(itr.next());
	/*
	 * Doesn't really print up the numbers is it ? Because the list doesn't
	 * contain numbers.
	 */

	/*
	 * Let's try this one.
	 */
	myList = Arrays.asList(1, "A", 3, 4);
	itr = myList.iterator();
	while (itr.hasNext())
	    System.out.println(itr.next());
    }

}

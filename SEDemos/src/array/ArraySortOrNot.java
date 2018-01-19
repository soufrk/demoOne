package array;

import java.util.Arrays;

/**
 * Guess what happens in these sorting scenarios.
 * 
 * @author soufrk
 *
 */

public class ArraySortOrNot {
    
    // Sort a String array
    public static void main1(String[] args) {
	String []arr = {"Z", "Y", "P", "T", "M"};
	Arrays.sort(arr, null);
	for(String i:arr)
	    System.out.println(i + " ");
    }

    // Sort an integer array
    public static void main2(String[] args) {
	int []arr = {1, 0, 7, 6, 3};
	Arrays.sort(arr, null);
	for(int i:arr)
	    System.out.println(i + " ");
    }
    
    // Sort an Object array.
    public static void main(String[] args) {
	Object []arr = {1, 0, 7, "6", 3};
	Arrays.sort(arr);
	for(Object i:arr)
	    System.out.println(i + " ");
    }

}

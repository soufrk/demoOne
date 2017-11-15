package array;

import java.util.Arrays;

/**
 * Guess what happens in the two sorting scenarios.
 * 
 * @author soufrk
 *
 */

public class ArraySortOrNot {

    public static void main1(String[] args) {
	int []arr = {1, 0, 7, 6, 3};
	//Arrays.sort(arr, null);
	System.out.println(arr);
    }
    
    public static void main(String[] args) {
	int []arr = {1, 0, 7, 6, 3};
	Arrays.sort(arr);
	for(int i:arr)
	    System.out.println(i + " ");
    }

}

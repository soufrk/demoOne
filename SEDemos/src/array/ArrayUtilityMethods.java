package array;

import java.util.Arrays;

/**
 * Demonstration of some utility methods in Arrays class.
 * 
 * @author soufrk
 *
 */
public class ArrayUtilityMethods {
    
    public static void main1(String[] args) {
	int []arr = {1, 0, 7, 6, 3, 1, 2};
	System.out.println(Arrays.binarySearch(arr, 0, arr.length, 0));
	System.out.println(Arrays.binarySearch(arr, 0, arr.length, 1));
	System.out.println(Arrays.binarySearch(arr, 0, arr.length, 8));
    }
    
    public static void main(String[] args) {
	int []arr = {1, 0, 7, 6, 3, 1, 2};
	System.out.println(Arrays.toString(arr));
    }

}

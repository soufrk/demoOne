package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * This shouldn't be hard to guess.
 * 
 * @author soufrk
 *
 */
public class ListTransformation {

    public static void main1(String[] args) {
	int[] arr = {2,1,3};
	List myList = Arrays.asList(arr);
	System.out.println(new HashSet(myList));
	System.out.println(new TreeSet(myList));
	System.out.println(new ConcurrentSkipListSet(myList));
    }
    
}

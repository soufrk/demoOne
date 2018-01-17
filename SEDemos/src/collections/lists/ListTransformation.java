package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Given if the following code throws an exception,
 * question is to guess the exception.
 * Plus one if last class in starck-trace is guessed.
 * 
 * This shouldn't be too hard to guess.
 * 
 * @author soufrk
 *
 */
public class ListTransformation {

    public static void main(String[] args) {
	int[] arr = {2,1,3};
	List myList = Arrays.asList(arr);
	System.out.println(new HashSet(myList));
	System.out.println(new TreeSet(myList));
	System.out.println(new ConcurrentSkipListSet(myList));
    }
    
}

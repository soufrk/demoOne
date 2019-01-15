package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The output is different than what you think.
 * 
 * @author soufrk
 *
 */
public class FailFastProblem {

    public static void main(String[] args) {
	Collection<String> myCollection = new LinkedList<>();
	myCollection.add("ABC");
	myCollection.add("BCD");
	Iterator<String> myItr = myCollection.iterator();
	for(String s:myCollection) {
	    System.out.println("s");
	    myItr.remove();
	}
    }

}

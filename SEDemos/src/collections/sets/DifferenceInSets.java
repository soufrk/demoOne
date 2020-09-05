package collections.sets;

import java.util.Set;
import java.util.HashSet;

public class DifferenceInSets {

    public static void main(String... args){
	    Set<Integer> numbersInRequest = new HashSet<>();
	    Set<Integer> numbersInDb = new HashSet<>();
	    /* Request */
	    numbersInRequest.add(9000);numbersInRequest.add(9005);
	    /* DB */
	    numbersInDb.add(9000);numbersInDb.add(9003);
	    /* Create copy of Sets */
	    Set<Integer> numbersToBeRemoved = new HashSet<>(numbersInDb);
	    Set<Integer> numbersToBeAdded = new HashSet<>(numbersInRequest);

	    numbersToBeRemoved.removeAll(numbersInRequest);
	    numbersToBeAdded.removeAll(numbersInDb);

	    System.out.println(numbersToBeRemoved);
	    System.out.println(numbersToBeAdded);
    }

}

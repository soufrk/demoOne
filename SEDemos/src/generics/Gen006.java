package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * A Generic implementation is not a different class.
 * @author souvik.goswami
 *
 */
public class Gen006 {

	public static void main(String[] args) {
		
		List <String> l1 = new ArrayList<String>();
		List <Integer> l2 = new ArrayList<Integer>();
		System.out.println(l1.getClass() == l2.getClass());

		// Conversly, the following is illegal
		//System.out.println(l1 instanceof Collection<String>);
		
		// But interestingly, the following is allowed  
		System.out.println(l1 instanceof Collection<?>);
		System.out.println(l1 instanceof List<?>);
		// Which again conversely tells List<?> is super of all lists.
		
		// Curiously, the following is illegeal as well
		//List<String> myList = new LinkedList<?>();
	}

}

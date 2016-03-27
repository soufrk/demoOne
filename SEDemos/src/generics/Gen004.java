package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Wildcards - the feature that provides even greater strength. 
 * @author soufrk
 *
 */
public class Gen004 {

	public static void main(String[] args) {
		List<BaseParent004> listOfBaseParent = new LinkedList<>();
		List<BaseChild1004> listOfChild1 = new LinkedList<>();
		List<BaseChild2004> listOfChild2 = new LinkedList<>();
		
		// Now we have already seen
		//listOfBaseParent = listOfChild1;
		// is not possible
		
		// Similarly,
		//listOfBaseParent = listOfChild2;
		// is also not possible
		
		/*
		 * Even List<Objects> can't help in this scenario
		 */
		//List<Object> listOfObjects = listOfBaseParent;
		
		/* What if we had a list that could traverse any of the
		 * the given lists
		 */
		
		List<?> listOfUnknows = new LinkedList<>();
		listOfUnknows = listOfBaseParent;
		listOfUnknows = listOfChild1;
		listOfUnknows = listOfChild2;
		
		/**
		 * But, there is a problem. List of unknown type can
		 * accept List of any types possible.
		 */
		List<Integer> listOfIntegers = new LinkedList<>();
		listOfUnknows = listOfIntegers;
	}

}

class BaseParent004{
	protected String name;
	public BaseParent004() {
		name = "Base Parent";
	}
}

class BaseChild1004 extends BaseParent004{
	public BaseChild1004(){
		name = "Base Child 1";
	}
}

class BaseChild2004 extends BaseParent004{
	public BaseChild2004() {
		name = "Base Child 2";
	}
}
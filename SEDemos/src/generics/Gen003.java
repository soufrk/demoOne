package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Different Generic Types with different classes in hierarchy can not
 * exchange references.
 * @author soufrk
 *
 * @param <E>
 */
public class Gen003<E> {

	public static void main(String[] args) {
		/*Gen002<BaseParent> genericObj1 = new Gen002<>();
		Gen002<BaseChild1> genericObj2 = new Gen002<>();
		Gen002<BaseParent> genericObj3 = new Gen002<>();*/
		
		/*genericObj1 = genericObj2;
		genericObj1 = genericObj3;*/

	}
	
}

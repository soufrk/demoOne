package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Generic with base-type cannot be exchanged for generic with sub-type.
 * references.
 * 
 * Predict where the code fails to compile.
 * 
 * @author soufrk
 *
 * @param <E>
 */
public class GenericTypeHierarchy<E> {

    public static void main(String[] args) {
	Gen002<BaseParent> genericObj1 = new Gen002<>();
	Gen002<BaseChild1> genericObj2 = new Gen002<>();
	Gen002<BaseParent> genericObj3 = new Gen002<>();

	genericObj1 = genericObj2;
	genericObj1 = genericObj3;
    }

}

package generics.hierarchy;

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
	GenericTypeHierarchy<BaseParent> genericObj1 = new GenericTypeHierarchy<>();
	GenericTypeHierarchy<BaseChild1> genericObj2 = new GenericTypeHierarchy<>();
	GenericTypeHierarchy<BaseParent> genericObj3 = new GenericTypeHierarchy<>();

	genericObj1 = genericObj2;
	genericObj1 = genericObj3;
    }

}

package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Classic example of type-erasure problem.
 * 
 * @author soufrk
 *
 */
public class TypeErasureClassic {

    public static void main(String[] args) {
	List<A> listA = new LinkedList<>();
	listA.add(new A());
	List listR = listA;
	List<B> listB = listR;
	listB.add(new B());
	listR = listB;
	List<C> listC = listR;
	listC.add(new C());
	
	System.out.println(listC);
    }

}

class A {
    @Override
    public String toString() {
	return "A:[]";
    }
}

class B extends A {
    @Override
    public String toString() {
	return "B:[]";
    }
}

class C extends B {
    @Override
    public String toString() {
	return "C:[]";
    }
}

package generics;

/**
 * Continuation of previous problem. Even after successfully inherting from a
 * Generic class, the code below doesn't seem to compile. Wonder why !
 * 
 * @author soufrk
 *
 * @param <E>
 */
public class InheritFromGenericClassProblem2 {

    public static void main(String args[]) {
	BaseParent p = new BaseChild1();
	ClassB<BaseChild1> c = new ClassB<BaseChild1>();
	c.add(p);
    }

}

class ClassA<E> {
    E e;

    public void add(E e) {
	System.out.println("Adding");
	this.e = e;
    }
}

class ClassB<T extends BaseParent> extends ClassA<BaseChild1> {

    public void add(T t) {
	System.out.println("Adding");
    }
}

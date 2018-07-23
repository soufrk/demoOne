package generics.hierarchy;

/**
 * Only one class compiles, you have to specify why others fails.
 * 
 * @author soufrk
 *
 * @param <E>
 */

public class InheritFromGenericClassProblem1 {}

class Parent<E> {
    E e;
    public void add(E e) {
	System.out.println("Adding in Parent");
	this.e = e;
    }
}

class Child1 extends ClassA<E extends Object>{
    public void add(E e) {
	System.out.println("Adding in Parent");
	this.e = e;
    }
}

class Child2<E> extends ClassA<Object> {
    public void add(E e) {
	System.out.println("Adding in Parent");
	this.e = e;
    }
}

class Child3<E extends Object> extends ClassA<String> {
    public void add(E e) {
	System.out.println("Adding in Child");
    }
}

class Child4<E extends String> extends ClassA<Object> {
    public void add(E e) {
	System.out.println("Adding in Child");
    }
}

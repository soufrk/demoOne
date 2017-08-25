package basics;

/**
 * Guess which call to be made 1st in constructor, in case of having overloaded
 * constructors.
 * 
 * @author soufrk
 *
 */
public class ConstructorOverlaod {
}

class Parent {
    Parent() {
	System.out.println("Parent");
    }

    Parent(String s) {
	super();
	this();
	System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
	System.out.println("Child");
    }

    Child(String s) {
	super();
	this();
	System.out.println("Child");
    }
}

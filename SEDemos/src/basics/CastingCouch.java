package basics;

/**
 * Methods to watch out for while down-casting.
 * 
 * @author soufrk
 *
 */
public class CastingCouch {

    public static void main(String[] args) {
	// Trying explicit down-casting
	Child c1 = new Child();
	Parent p1 = (Parent) c1;
	p1.showA();
	p1.showB();
	(Child)p1.showC();
	((Child) p1).showC();
    }

}

class Parent {
    void showA() {
	System.out.println("Parent-A");
    }

    void showB() {
	System.out.println("Parent-B");
    }
}

class Child extends Parent {
    void showA() {
	System.out.println("Child-A");
    }

    void showC() {
	System.out.println("Parent-B");
    }
}
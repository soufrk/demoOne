package basics;

/**
 * What if one day you decide to experiment with static fields and methods in
 * classes under hierarchy.
 * 
 * @author soufrk
 *
 */
public class OverloadStatics {

    public static void main(String[] args) {
	A object1 = new A();
	B object2 = new B();
	A object3 = new B();
	A object4 = null;
	
	System.out.println("===== Object 1 =====");
	System.out.println(object1.i);
	System.out.println(object1.showInt());
	System.out.println(object1.printI());
	
	System.out.println("===== Object 2 =====");
	System.out.println(object2.i);
	System.out.println(object2.showInt());
	System.out.println(object2.printI());
	
	System.out.println("===== Object 3 =====");
	System.out.println(object3.i);
	System.out.println(object3.showInt());
	System.out.println(object3.printI());
	
	System.out.println("===== Object 4 =====");
	System.out.println(object4.i);
	System.out.println(object4.showInt());
	System.out.println(object4.printI());
    }
    
}

class A {
    static int i = 10;
    static int showInt() {return i;}
    int printI() {return i;}
}

class B extends A {
    static int i = 20;
    static int showInt() {return i;}
    int printI() {return i;}
}

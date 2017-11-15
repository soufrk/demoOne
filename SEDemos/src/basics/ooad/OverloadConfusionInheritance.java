package basics.ooad;

/**
 * Guess the ouput. Hint: guess what happens if we comment all methods, and
 * start uncommenting from bottom one to top.
 * 
 * @author soufrk
 *
 */
public class OverloadConfusionInheritance {

    public static void main(String[] args) {
	MyInterface first = new Implementation1();
	Implementation2 second = new Implementation2();
	method(first);
	method((Object) first);
	method(second);
	method((MyInterface) second);
    }

    public static void method(Implementation1 i) {
	System.out.println(i.getName());
    }

    public static void method(Implementation2 i) {
	System.out.println(i.getName());
    }

    public static void method(MyInterface s) {
	System.out.println("Interface");
    }

    public static void method(Object o) {
	System.out.println("Object");
    }

}

interface MyInterface {
    String getName();
}

class Implementation1 implements MyInterface {
    public String getName() {
	return "Implementation1";
    }
}

class Implementation2 implements MyInterface {
    public String getName() {
	return "Implementation2";
    }
}

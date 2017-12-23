package interfaces;

/**
 * 
 * Only one of these class compiles correctly. 
 * 
 * Hint - If there are final variables of same name in both an interface and the
 * concrete implementation.
 * 
 * Further - Given that if it allowed, how can we access the variable of interface.
 * 
 * @author soufrk
 *
 */
public interface MyInterface002 {
    String message = "Hello";
}

class Class1 implements MyInterface002 {

    final String message;
    
    public Class1() {}

    public static void main(String[] args) {
	System.out.println(message);
	/*
	 * Since interface fields are static and final they should be accessed
	 * in a static way.
	 */
	System.out.println(MyInterface002.message);
    }

}

class Class2 implements MyInterface002 {

    static final String message = "World";

    public Class2() {}

    public static void main(String[] args) {
	System.out.println(message);
	/*
	 * Since interface fields are static and final they should be accessed
	 * in a static way.
	 */
	System.out.println(MyInterface002.message);
    }

}

class Class3 implements MyInterface002 {

    static final String message = "World";

    public Class3() {message = "New Value";}

    public static void main(String[] args) {
	System.out.println(message);
	/*
	 * Since interface fields are static and final they should be accessed
	 * in a static way.
	 */
	System.out.println(MyInterface002.message);
    }

}

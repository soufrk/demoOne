package generics;

/**
 * Guess the outcome.
 * 
 * @author soufrk
 *
 */
public class TheGenericMethodPreference {

    public static void main(String[] args) {
	foo("abcd");
    }

    private static void method(String s) {
	System.out.println("The string one.");
    }

    private static void method(Object o) {
	System.out.println("The object one.");
    }

    public static <T> void foo(T t) {
	method(t);
    }
    // Now, how do we make the String version being called.

    // You can hope if this works
    public static <T> void foo(<? extends String> t){
  	method(t);
      }

    // Or, this 
    public static <T extends String> void foo(T t) {
	method(t);
    }

}

package generics;

class MyClass<T>{
    private static int count = 0;
    public MyClass(){count++;}
    static int getCount(){return count;}
}

/**
 * Adapted from Book by author SG Ganesh.
 * Guess the count of the counter.
 * 
 * @author soufrk
 *
 */
public class GenericClassCounter {

    public static void main(String[] args) {
	MyClass<Integer> a = new MyClass<>();
	MyClass<Integer> b = null;
	MyClass c = new MyClass();
	System.out.println(a.getCount());
	System.out.println(b.getCount());
	System.out.println(c.getCount());
    }

}

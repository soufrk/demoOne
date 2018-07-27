package array;

/**
 * Should this code even compile. If so what should be the output.
 * 
 * @author soufrk
 *
 */
public class TheArrayOfObjectsProblem {

    public static void main1(String[] args) {
	MyClass[] a = new MyClass[2];
	Object[] b = null;
	b = a;
	b[0] = "ABC";
    }
    
    public static void main2(String[] args) {
	MyClass[] a = new MyClass[2];
	Object[] b = null;
	a = b;
	a[0] = new MyClass();
    }
    
    public static void main3(String[] args) {
	MyClass[] a = new MyClass[2];
	Object[] b = null;
	b = a;
	b[0] = new MyClass();
	b[1] = "ABC";
    }
    
    public static void main(String[] args) {
	MyClass[] a = new MyClass[2];
	Object[] b = null;
	b = a;
	b[0] = new MyClass();
	b[1] = new MyClass();
	b[2] = "ABC";
    }

}

class MyClass {
    
}
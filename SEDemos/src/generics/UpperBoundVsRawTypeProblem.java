package generics;

/**
 * One of these methods will not comile.
 * 
 * @author soufrk
 *
 */
public class UpperBoundVsRawTypeProblem {

    public static void main(String[] args) {
	foo(new C<B>());
	foo(new C<D>());
	foo(new C<E>());
	foo(new C());
    }

    interface B{}
    interface D extends B{}
    interface E extends D{}
    
    static class C<T>{}
    static void foo(C<? super D> e){}
}

package exceptions;

import java.io.IOException;

/**
 * Demonstrates that a base-type exception be declared
 * as thrown while over-riding. Be it Checked/Unchecked.
 * 
 * In other words, while over-riding, a method cannot
 * throw more generic version exception declared in base
 * class.
 * 
 * Simply put an overriden method cannot declare to 
 * throw a parent-class of that defined in it's base class.
 * 
 * @author souvik.goswami
 *
 */
public class Exception10 {

}

class A {
    void m1() throws NullPointerException {}
    void m2() throws IOException {}
}

class B extends A {
    void m1() throws Exception {}
    void m2() throws Exception {}
}
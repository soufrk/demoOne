package basics;

/**
 * If we are defining an abstract method as synchronized in parent class,
 * is it required to define it the same, while overriding it ?
 * 
 * @author soufrk
 *
 */
public abstract class AbstractSynchronizedMethod {
    protected abstract synchronized void print();
}

class A extends AbstractSynchronizedMethod{
    protected synchronized void print(){}
    public void print(){}
}

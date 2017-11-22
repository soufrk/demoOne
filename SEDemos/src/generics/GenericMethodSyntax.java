package generics;

/**
 * Simple Generic method construct.
 * 
 * Guess which of these definitions produces what kinds of 
 * compilation errors if any.
 * 
 * @author soufrk
 *
 */
public class GenericMethodSyntax {

    public void printObject(T t){}

    public <T> void printObject(T t) {}

    public <T>void printObject(Class<T extends Object> e){}

    public <T> void printObject(Class<T> t) {}

    public void printObject(Class<? extends Object> e) {}

}

public class GenericMethodSyntax<T> {

    public void printObject(T t){}

    public <T> void printObject(T t) {}

    public <T>void printObject(Class<T extends Object> e){}

    public <T> void printObject(Class<T> t) {}

    public void printObject(Class<? extends Object> e) {}

}

public class GenericMethodSyntax<E> {

    public void printObject(T t){}

    public <T> void printObject(T t) {}

    public <T>void printObject(Class<T extends Object> e){}

    public <T> void printObject(Class<T> t) {}

    public void printObject(Class<? extends Object> e) {}

}

public class GenericMethodSyntax<T> {

    public void printObject(T t){}

    public <T> void printObject(T t) {}

    public <T>void printObject(Class<T extends Object> e){}

    public <T> void printObject(Class<T> t) {}

    public void printObject(Class<? extends Object> e) {}

}

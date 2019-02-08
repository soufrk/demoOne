package innerclass;

/**
 * Guess which access-specifiers can be used in
 * definition of a method-local inner-class.
 * 
 * @author soufrk
 *
 */
public class MethodLocalAccessSpecifier {

	void show(){
	    class MyClassA{}
	    private class MyClassB{}
	    protected class MyClassC{}
	    public class MyClassD{}
	    abstract class MyClassE{}
	    final class MyClassF{}
	}

}

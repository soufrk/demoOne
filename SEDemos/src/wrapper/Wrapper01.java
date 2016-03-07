package wrapper;

/**
 * Default values of Wrappers.
 * !! Be aware this is a trap. !!
 * 
 * @author soufrk
 *
 */
public class Wrapper01 {
	
	int a;
	Integer b;
	
	boolean c;
	Boolean d;

	public static void main(String[] args) {
		// 1. No default constructors //
		//Integer i = new Integer();
		//System.out.println("" + new Integer().toString()); // Great danger
		
		// 2. Not possible to print an uninitialied reference.
		//Integer i;
		//System.out.println(i);
		
		Wrapper01 obj = new Wrapper01();
		obj.showPrimitives();
	}
	
	public void showPrimitives(){
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
	}

}

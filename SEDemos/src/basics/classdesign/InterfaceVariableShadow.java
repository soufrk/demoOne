package basics.classdesign;

/**
 * Guess the output.
 * 
 * @author souvik
 *
 */

public class InterfaceVariableShadow {

    public static void main(String[] args) {
	One o = new One();
	System.out.println(o.name);

	Two t1 = new Two();
	System.out.println(t1.name);
	
	Three t2 = new Three()
	System.out.println(t2.name);
    }

    static class One implements MyInterface {
	public String name;

	public One() {
	    name = "Child";
	}
    }

    static class Two implements MyInterface {
    }
    
    static class Three implements MyInterface {
	private static name = "ABC";
    }
}

interface MyInterface {
    String name = "Base";
}

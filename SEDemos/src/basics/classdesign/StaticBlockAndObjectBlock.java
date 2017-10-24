package basics.classdesign;

/**
 * What is a static block and an object block ?
 * 
 * @author soufrk
 *
 */
public class StaticBlockAndObjectBlock {

    static {
	System.out.println("Static");
    }

    {
	System.out.println("Object");
    }

    public StaticBlockAndObjectBlock() {
	System.out.println("Constructor");
    }

    public static void main(String[] args) {
	new StaticBlockAndObjectBlock();
	new StaticBlockAndObjectBlock();
    }

}

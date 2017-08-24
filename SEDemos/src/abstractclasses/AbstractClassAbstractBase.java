package abstractclasses;

abstract class Base01 {
    protected int x;

    public Base01() {
	System.out.println("Base");
	this.x = 10;
    }
}

abstract class Child extends Base01 {
    public Child() {
	System.out.println("Child");
	this.x = 20;
    }
}

/**
 * Just in case you might have forgotten,
 * predict the output.
 */
public class AbstractClassAbstractBase extends Child {

    public static void main(String[] args) {
	System.out.println(new AbstractClassAbstractBase().x);
    }

}

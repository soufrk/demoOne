package abstractclasses;

abstract class Base01 {
	protected int x;

	public Base01() {
		this.x = 10;
	}

}

abstract class Child extends Base01 {
	public Child() {
		this.x = 20;
	}
}

/**
 * Just in case you might have forgotten this one.
 */
public class AbstractClass05 extends Child {

	public static void main(String[] args) {
		System.out.println(new AbstractClass05().x);
	}

}

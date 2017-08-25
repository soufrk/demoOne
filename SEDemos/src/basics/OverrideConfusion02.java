package basics;

/**
 * Confusion of field with methods in late binding.
 * 
 * @author soufrk
 *
 */
public class OverrideConfusion02 {

    public static void main(String[] args) {
	// Part - 1
	Parent01 p1 = new Parent01();
	System.out.println(p1.m + ", " + p1.show());
	Child01 c1 = new Child01();
	System.out.println(c1.m + ", " + c1.show());

	// Part - 2
	Parent01 p2 = new Child01();
	System.out.println(p2.m + ", " + p2.show());
	Child01 c2 = (Child01) p2;
	System.out.println(c2.m + ", " + c2.show());
    }

}

class Parent01 {
    String m = "P";

    String show() {return m;}
}

class Child01 extends Parent01 {
    String m = "Q";

    String show() {return m;}
}
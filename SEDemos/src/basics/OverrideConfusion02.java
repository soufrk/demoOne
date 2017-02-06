package basics;

/**
 * Confusion of field with methods in late binding.
 * @author soufrk
 *
 */
public class OverrideConfusion02 {

	public static void main(String[] args) {
		
		// Part - 1
		Parent01 p = new Parent01();
		System.out.println(p.m + ", " + p.show());
		Child01 c = new Child01();
		System.out.println(c.m + ", " + c.show());
		
		// Part - 2
		Parent01 p = new Child01();
		System.out.println(p.m + ", " + p.show());
		Child01 c = (Child01)p;
		System.out.println(c.m + ", " + c.show());
		
	}

}

class Parent01{
	String m = "P";
	String show(){
		return m;
	}
}

class Child01 extends Parent01{
	String m = "Q";
	String show(){
		return m;
	}
}
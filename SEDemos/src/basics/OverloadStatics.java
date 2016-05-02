package basics;

/**
 * What if one day you decide to experiment with static fields and 
 * methods in classes under hierarchy.
 * 
 * @author soufrk
 *
 */
public class OverloadStatics {

	public static void main(String[] args) {
		//A object = new A();
		//B object = new B();
		//A object = new B();
		A object = null;
		
		System.out.println(object.i);
		System.out.println(object.showInt());
		System.out.println(object.printI());

	}

}

class A{
	static int i = 10;
	static int showInt(){ return i;}
	int printI(){return i;}
}

class B extends A{
	static int i = 20;
	static int showInt(){ return i;}
	int printI(){return i;}
}

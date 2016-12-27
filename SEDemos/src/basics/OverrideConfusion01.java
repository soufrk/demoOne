package basics;

/**
 * So, will there be any change in the output if Line #19 is
 * replaced by Line #18.
 * @author soufrk
 *
 */
public class OverrideConfusion01 {

	public static void main(String[] args) {
		new B94().methodOne();
	}
}

class A94{
	public void methodOne(){
		System.out.println("A One");
		//methodTwo();
		this.methodTwo();
	}
	
	public void methodTwo(){
		System.out.println("A Two");
	}
}

class B94 extends A94{
	public void methodOne(){
		System.out.println("B One");
		super.methodOne();
	}
	
	public void methodTwo(){
		System.out.println("B Two");
	}
}
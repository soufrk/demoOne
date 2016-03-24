package innerclass;

/**
 * Demonstration of anonymous inner class - I (extend class)
 * 
 * @author soufrk
 *
 */
public class InnerClass07 {
	
	public static void main(String[] args) {
		MyInner07 referenceA = new MyInner07(){
			@Override
			public void show(){
				System.out.println("World !!");
			}
		};
		
		MyInner07 referenceB = new MyInner07();
		
		referenceA.show();
		referenceB.show();
	}

}

class MyInner07{
	
	public void show(){
		System.out.println("Hello");
	}
	
}
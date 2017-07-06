package innerclass;

/**
 * Anonymous types can be passed as argument in a method as well.
 * @author soufrk
 *
 */
public class AnonymousClassAsArgument {

	public static void main(String[] args) {
		display(new MyInterface11() {
			
			@Override
			public void display() {
				System.out.println("Anonymous instance of MyInterface11 displays");
				
			}
		});

	}
	
	public static void display(MyInterface11 interface11){
		interface11.display();
	}

}

interface MyInterface11{
	void display();
}

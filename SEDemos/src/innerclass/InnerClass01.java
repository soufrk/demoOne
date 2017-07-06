package innerclass;

/**
 * Various types of inner classes.
 * @author soufrk
 *
 */
public class InnerClassFlavours {

	/*
	 * Simple inner class.
	 * @author soufrk
	 *
	 */
	class Inner2 {
		public void show(){
			System.out.println("Inner2 is shown.");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Method local inner class.
		 * @author soufrk
		 *
		 */
		class Inner2 {}
		
	}
	
	public void show(){
		
		/*
		 * Anonymous Inner Class. p refers to an anonymous instance of subclass of Inner2, and
		 * not Inner2. Override annotation proves it.
		 */
		Inner2 p = new Inner2(){
			@Override
			public void show(){
				System.out.println("Anonymous instance of Inner2 is shown.");
			}
		};
		
	}

}

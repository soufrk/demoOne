package innerclass;

/**
 * Various types of inner classes.
 * @author souvik.goswami
 *
 */
public class InnerClass01 {

	/*
	 * Simple inner class.
	 * @author souvik.goswami
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
		 * @author souvik.goswami
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

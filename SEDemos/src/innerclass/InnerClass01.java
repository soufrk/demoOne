package innerclass;

/**
 * Various types of inner classes.
 * @author souvik.goswami
 *
 */
public class InnerClass01 {

	/**
	 * Simple inner class.
	 * @author souvik.goswami
	 *
	 */
	class Inner2 {
	}
	interface InnerInterface1{};

	public static void main(String[] args) {
		/**
		 * Method local inner class.
		 * @author souvik.goswami
		 *
		 */
		class Inner2 {}
		
		// What's wrong in declaring an interface here ??
		//interface InnerInterface1{};
	}
	
	public void show(){
		class Inner2{}
		
		// What's wrong in declaring an interface here ??
		//interface InnerInterface1{};
	}

}

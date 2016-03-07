package innerclass;

import java.util.Calendar;

/**
 * Demonstrates the instantiation/access on Inner class from an Outer/Enclosing
 * class.
 * @author souvik.goswami
 *
 */
public class InnerClass02 {

	/**
	 * Instantiation inside non-static method. Can be done simply.
	 * As it has an implicit <b>this</b> reference.
	 */
	public void show(){
		//Inner inner  = new Inner();
		Inner inner  = this.new Inner();
		inner.show();
	}
	
	/**
	 * Instantiation inside non-static method. Cannot be done simply.
	 * As it has an implicit <b>this</b> reference. So, need to create an
	 * instance of outer class first.
	 * @param args
	 */
	public static void main(String[] args) {
		//Inner inner  = new Inner(); /* Instance of Inner class not */ 
		/* possible without an outer instance. */
		
		/*InnerClass02 outer = new InnerClass02();
		InnerClass02.Inner inner = outer.new Inner();*/
		
		/* OR in one-line */
		//InnerClass02.Inner inner = new InnerClass02().new Inner();
	}
	
	class Inner{
		public void show(){
			System.out.println(Calendar.getInstance().getTime());
		}
	}

}

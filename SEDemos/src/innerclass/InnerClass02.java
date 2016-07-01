package innerclass;

/**
 * So, is it possible to have inner-interfaces same way ??
 * @author soufrk
 *
 */
public class InnerClass02 {

	/*
	 * Simple inner interface is possible.
	 */
	interface InnerInterface1{};

	public static void main(String[] args) {
		
		/*
		 * Can we have method local inner interface ?
		 * @author soufrk
		 *
		 */
		// interface InnerInterface1{};
		
		// What's wrong in declaring an interface here ??
		
	}
	
	public void show(){
		/*
		 * Can we have interface inside non-static method ?
		 */
		// interface InnerInterface1{};
		
		// What's wrong in declaring an interface here ??
	}

}

package basics;

/**
 * Sequence of invocation of an init-block, constructor
 * and obviously the static block.
 * @author soufrk
 *
 */
public class InitBlock {
	
	static{
		System.out.println("Hello here !!");
	}
	
	{
		System.out.println("Hello there !!");
	}
	
	void show(){
		System.out.println("Hello everywere !!");
	}

	public static void main(String[] args) {
		new InitBlock().show();
	}

}

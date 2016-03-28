package exceptions;

/**
 * Demonstrates that <code>finally</code>-block will get executed even if there
 * is Exception in <code>catch</code>-block.
 * @author soufrk
 *
 */
public class Exception01 {

	public static void main(String[] args) {
		//methodA();
		System.out.println(methodB());
	}
	
	public static void methodA(){
		try{
			System.out.println("A");
			throw new NullPointerException();
		}catch(Exception e){
			System.out.println("B");
			throw new RuntimeException();
			//System.out.println("C");
		}finally{
			System.out.println("D");
		}
	}
	
	public static int methodB(){
		try{
			return -1;
			//throw new NullPointerException();
		}catch(Exception e){
			return -2;
			//throw new RuntimeException();
			//System.out.println("C");
		}finally{
			return -3;
		}
	}

}

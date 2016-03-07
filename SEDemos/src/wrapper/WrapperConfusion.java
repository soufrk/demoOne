package wrapper;

/**
 * Interesting confusions created by Wrapper implementation.
 * @author soufrk
 *
 */
public class WrapperConfusion {

	public static void main(String[] args) {
		
		Integer i = 10;
		Integer j = 10;
		//Integer l = 10;
		System.out.println(i == j);
		Integer k = new Integer(10);
		i++;
		System.out.println(i == j);
		System.out.println(i == k);
		

	}

}

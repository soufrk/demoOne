package operators;

/**
 * A single pipe or and acts as a bitwise operator.
 * @author soufrk
 *
 */
public class BitWise01 {

	public static void main(String[] args) {
		/*boolean b = true;
		boolean a = true;
		System.out.println(a|b);*/
		
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				System.out.format("%d|%d = %d, %d&%d = %d\n", i, j, i|j, i, j, i&j);

	}

}

package basics.operators;

/**
 * The question is not about guessing the output only.
 * 
 * @author soufrk
 *
 */
public class OperatorPrecedence {

    public static void main(String[] args) {
	int i = 0;
	int[] j = { 1, 2, 3 };
	System.out.println((i++ + j[i]));
	System.out.println((j[i] + i++));
    }

}

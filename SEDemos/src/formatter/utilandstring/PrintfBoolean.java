package formatter.utilandstring;

/**
 * Guess the output.
 * 
 * @author soufrk
 *
 */
public class PrintfBoolean {

    public static void main(String[] args) {
	System.out.printf("1->%b", 1);
	System.out.printf("\nnull->%b", null);
	System.out.printf("\n2->%b", 2);
	System.out.printf("\nTRUE->%b", "TRUE");
	System.out.printf("\nTRUE->%b", "true");
	System.out.printf("\nfalse->%b", "false");
	System.out.printf("\nFALSE->%b", "FALSE");
	System.out.printf("\nfalse->%b", false);
    }

}

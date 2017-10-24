package basics.bitwiseoperator;

public class BitwiseLeftShift {
    
    /* Binary value operands */
    public static void main(String[] args) {
	int i = 0;
	int j = 1;
	int k = 2;
	int l = 3;
	
	performBitwiseLeftShift(i, j);
	performBitwiseLeftShift(j, k);
	performBitwiseLeftShift(i, k);
	
	performBitwiseLeftShift(l, k);
	performBitwiseLeftShift(l, j);
    }
    
    private static void performBitwiseLeftShift(int i, int j){
	System.out.println("i="+ i + " (Binary:" + Integer.toBinaryString(i) + ")");
	System.out.println("j="+ j);
	int result = i<<j;
	System.out.println("i<<j=" + result + " (Binary:" + Integer.toBinaryString(result) + ")\n");
    }

}

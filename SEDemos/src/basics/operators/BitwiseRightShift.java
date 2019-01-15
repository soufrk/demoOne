package basics.operators;

public class BitwiseRightShift {
    
    /* Decimal value operands */
    public static void main(String[] args) {
	int i = 16;
	int j = 10;
	int k = 8;
	int l = 3;
	
	performBitwiseRightShift(i, 1);
	performBitwiseRightShift(i, 2);
	
	performBitwiseRightShift(j, 1);
	performBitwiseRightShift(j, 2);
	
	performBitwiseRightShift(k, 1);
	performBitwiseRightShift(k, 2);
	
	performBitwiseRightShift(l, 1);
	performBitwiseRightShift(l, 2);
    }
    
    private static void performBitwiseRightShift(int i, int j){
	System.out.println("i="+ i + " (Binary:" + Integer.toBinaryString(i) + ")");
	System.out.println("j="+ j);
	int result = i>>j;
	System.out.println("i>>j=" + result + " (Binary:" + Integer.toBinaryString(result) + ")\n");
    }
}

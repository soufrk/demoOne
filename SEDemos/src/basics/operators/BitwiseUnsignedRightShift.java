package basics.operators;

public class BitwiseUnsignedRightShift {
    /* Binary value operands */
    public static void main(String[] args) {
	int i = 16;
	int j = -16;
	int k = 10;
	int l = -10;
	
	performUnsignedBitwiseRightShift(i, 1);
	performUnsignedBitwiseRightShift(i, 2);
	
	performUnsignedBitwiseRightShift(j, 1);
	performUnsignedBitwiseRightShift(j, 2);
	
	performUnsignedBitwiseRightShift(k, 1);
	performUnsignedBitwiseRightShift(k, 2);
	
	performUnsignedBitwiseRightShift(l, 1);
	performUnsignedBitwiseRightShift(l, 2);
    }
    
    private static void performUnsignedBitwiseRightShift(int i, int j){
	System.out.println("i="+ i + " (Binary:" + Integer.toBinaryString(i) + ")");
	System.out.println("j="+ j);
	int result = i>>>j;
	System.out.println("i>>>j=" + result + " (Binary:" + Integer.toBinaryString(result) + ")\n");
    }
}

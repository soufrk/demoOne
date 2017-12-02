package basics.operators;

/**
 * Illustration of bitwise-AND operation.
 * @author soufrk
 *
 */
public class BitwiseAnd {

    /* Decimal value operands */
    public static void main1(String[] args) {
	int i = 0;
	int j = 1;
	int k = 2;
	performBitwiseAndOperation(i, j);
	performBitwiseAndOperation(j, k);
	performBitwiseAndOperation(i, k);
    }
    
    /* Hexa-decimal value operands */
    public static void main2(String[] args) {
	int i = 0x00;
	int j = 0x01;
	int k = 0x10;
	int l = 0x11;
	
	performBitwiseAndOperation(i, j);
	performBitwiseAndOperation(j, k);
	performBitwiseAndOperation(i, k);
	
	performBitwiseAndOperation(l, k);
	performBitwiseAndOperation(l, j);
    }
    
    /* Binary value operands */
    public static void main(String[] args) {
	int i = 0b00;
	int j = 0b01;
	int k = 0b10;
	int l = 0b11;
	
	performBitwiseAndOperation(i, j);
	performBitwiseAndOperation(j, k);
	performBitwiseAndOperation(i, k);
	
	performBitwiseAndOperation(l, k);
	performBitwiseAndOperation(l, j);
    }
    
    private static void performBitwiseAndOperation(int i, int j){
	System.out.println("i="+ i + " (Binary:" + Integer.toBinaryString(i) + ")");
	System.out.println("j="+ j + " (Binary:" + Integer.toBinaryString(j) + ")");
	int result = i&j;
	System.out.println("i&j=" + result + " (Binary:" + Integer.toBinaryString(result) + ")\n");
    }

}

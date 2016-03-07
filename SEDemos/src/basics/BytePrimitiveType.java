package basics;

/**
 * Demonstrates the conversion of integer values casted in byte.
 * @author souvik.goswami
 *
 */
public class BytePrimitiveType {

	public static void main(String[] args) {
		
		BytePrimitiveType obj = new BytePrimitiveType();
		System.out.println(obj.printByte(0));
		System.out.println(obj.printByte(1));
		
		System.out.println(obj.printByte(127));
		System.out.println(obj.printByte(128));
		
		System.out.println(obj.printByte(254));
		System.out.println(obj.printByte(255));
		System.out.println(obj.printByte(256));
	}
	
	String printByte(int n){
		return n + "-> " + (byte)n;
	}

}

package basics;

/**
 * So, what should be the output ?
 * @author soufrk
 *
 */
public class ReturnFromIf {

	public static void main(String[] args) {
		System.out.println(returnValue(0));
		System.out.println(returnValue(1));
		System.out.println(returnValue(2));
	}
	
	public static int returnValue(int x){
		if(x ==1)
			return 1;
		else if(x==2)
			return 2;
		return 3;
	}

}

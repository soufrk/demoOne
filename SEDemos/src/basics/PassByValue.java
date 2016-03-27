package basics;

/**
 * Demonstrates the basics of pass-by-value parameters.
 * @author soufrk
 *
 */
public class PassByValue {

	public static void main(String[] args) {
		/*int t = 5;
		new PassByValue().change(t);
		System.out.println(t);*/
		
		Integer t = 5;
		new PassByValue().change(t);
		//t++;
		System.out.println("t=" + t);

	}
	
	/*private void change(int t){
		System.out.println("int");
		t++;
	}*/
	
	private void change(Integer t){
		System.out.println("t=" + t);
		t++;
	}

}

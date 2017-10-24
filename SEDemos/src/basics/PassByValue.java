package basics;

/**
 * Demonstrates the basics of pass-by-value parameters.
 * 
 * @author soufrk
 *
 */
public class PassByValue {

    public static void main(String[] args) {
	int i = 5;
	PassByValue instance = new PassByValue();
	instance.change(i);
	System.out.println("i=" + i);

	Integer t = 5;
	instance.change(t);
	// t++;
	System.out.println("t=" + t);
    }

    private void change(int t) {
	System.out.println("Change int");
	t++;
	System.out.println("Value in method agr=" + t);
    }

    private void change(Integer t) {
	System.out.println("Change Integer");
	t++;
	System.out.println("Value in method arg=" + t);
    }

}

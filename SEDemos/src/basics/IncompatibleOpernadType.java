package basics;

/**
 * Guess the output.
 * @author soufrk
 *
 */
public class IncompatibleOpernadType {

    public static void main1(String[] args) {
	int i = 1;
	int j = 2;
	System.out.println("i == j" + i==j);
    }
    
    public static void main2(String[] args) {
	double i = 1.0d;
	double j = 1.00d;
	System.out.println("i == j" + i==j);
    }
    
    public static void main3(String[] args) {
	char i = 'd';
	char j = 'd';
	System.out.println("i == j" + i==j);
    }
    
    public static void main4(String[] args) {
	boolean i = true;
	boolean j = false;
	System.out.println("i == j" + i==j);
    }
    
    public static void main(String[] args) {
	String i = "A";
	String j = "A";
	System.out.println("i == j" + i==j);
    }

}

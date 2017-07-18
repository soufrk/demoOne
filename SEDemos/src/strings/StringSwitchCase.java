package strings;

/**
 * Is the behaviour of switch-case same as integer values.
 * 
 * @author soufrk
 *
 */
public class StringSwitchCase {
	public static void main(String[] args) {
		//String test = "A";
		String test = "B";
		switch (test){
		    case "A":System.out.println("Print A");
		    default: System.out.println("Print C");
		    case "B":System.out.println("Print B");
		    default: System.out.println("Print C");
		}
	}
}

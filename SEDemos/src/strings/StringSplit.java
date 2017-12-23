package strings;

/**
 * Guess the output.
 * 
 * @author soufrk
 *
 */
public class StringSplit {

    public static void main(String[] args) {
	String input = "A,B,C,D,E,F,G";
	String[] tokens = input.split(",", 2);
	for(String token:tokens){
	    System.out.println(token);
	}
    }

}

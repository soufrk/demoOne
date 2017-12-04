package strings;

/**
 * Handy null or empty & reverse check.
 * 
 * @author soufrk
 *
 */
public class NullOrEmptyCheck {

    public static void main(String[] args) {
	String input[] = { null, "", " ", "." };
	for (String temp : input) {
	    System.out.println(checkNullOrEmpty(temp));
	}

    }

    public static void nullCheck(byte[] arr) {
	if (arr != null && !new String(arr).trim().isEmpty())
	    System.out.println("Not Empty/Null");
	else
	    System.out.println("Empty/Null");

    }

    public static boolean checkNullOrEmpty(String input) {
	return input != null ? input.trim().isEmpty() : true;
    }

    public static boolean checkNotEmpty(String input) {
	return input != null ? !input.trim().isEmpty() : false;
    }

}

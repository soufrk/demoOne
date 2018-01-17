package strings;

/**
 * Guess the output.
 * 
 * @author soufrk
 *
 */
public class StringBufferAndNullObject {

    public static void main(String[] args) {
	Object nullObject = null;
	StringBuffer buffer = new StringBuffer(10);
	buffer.append(nullObject);
	System.out.println(buffer);
	System.out.println(nullObject);
	System.out.printf(nullObject);
	System.out.printf(null);
    }

}

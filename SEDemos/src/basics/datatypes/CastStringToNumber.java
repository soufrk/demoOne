package basics.datatypes;

/**
 * Watch how Wrapper type get casted and guess the answer. Specially a
 * <tt>null</tt>.
 * 
 * @author soufrk
 *
 */
public class CastStringToNumber {

    public static void main(String args[]) {
	/* Cast any String-type to Long */
	String s1 = "abc";
	Object o1 = s1;
	System.out.println((Long) o1);
	
	/* Cast null in String to Long */
	String s2 = null;
	Object o2 = s2;
	System.out.println((Long)o2);
	System.out.println((String)o2);
	
	/* Parse Long from null String */
	 String s3 = null;
	 Object o3 = s3;
	 System.out.println(Long.parseLong(o3));
	 System.out.println(Long.parseLong((String)o3));
    }

}

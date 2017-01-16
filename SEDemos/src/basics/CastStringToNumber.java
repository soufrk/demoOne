package basics;

/**
 * Watch how Wrapper type get casted and guess the answer.
 * Specially a <tt>null</tt>. 
 * @author soufrk
 *
 */
public class CastStringToNumber {
	
	public static void main(String args[]){
		
		/* Cast any String-type to Long */
		String s = "abc";
		Object o = s;
		System.out.println((Long)o);
		
		/* Cast null in String to Long */
		/*String s = null;
		Object o = s;
		System.out.println((Long)o);
		System.out.println((String)o);*/
		
		/* Parse Long from null String */
		/*String s = null;
		Object o = s;
		System.out.println(Long.parseLong(o));
		System.out.println(Long.parseLong((String)o));*/
	}

}

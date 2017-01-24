package exceptions;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Guess what happens next !!
 * @author soufrk
 *
 */
public class Exception06 {

	public static void main(String[] args) throws Exception {
		try{
			throw new NullPointerException();
		} catch(IOException | SQLException e){
			e = new IllegalArgumentException();
			throw e;
		}
	}
}

package exceptions;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Exception class can be declared as thrown from anywhere-II
 * 
 * How can you declare to throw checked-exception out of nowhere.
 * @author soufrk
 *
 */
public class Exception04 {

	//public static void main(String[] args) throws Exception {
	public static void main(String[] args) throws IOException, SQLException {
		try{
			/*methodA();
			methodB();*/
		}catch(Exception e){
			throw e;
		}

	}
	
	public static void methodA() throws IOException{
		throw new IOException();
	}
	
	public static void methodB() throws SQLException{
		throw new SQLException();
	}

}

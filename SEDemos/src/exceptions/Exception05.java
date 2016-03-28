package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Rules of exception declaration in inheritance(overriding). 
 * @author soufrk
 *
 */
public class Exception05 {

}

class A03{
	void m1() throws IOException{}
	void m2() throws FileNotFoundException{}
	void m3() throws ClassCastException{}
	void m4() throws NumberFormatException{}
	void m5() throws Exception{}
}

class B03 extends A03{
	
	/* Cannot add base-type of any exceptions declared in parent */
	//void m2() throws IOException{}
	
	/* Cannot declare Exception as thrown type, until defined in base
	 * version */ 
	//void m1() throws Exception{}
	//void m2() throws Exception{}
	//void m3() throws Exception{}
	void m5() throws Exception{}
	
	/* Cannot add new checked-exceptions */
	//void m1() throws ClassNotFoundException{}
	
	/* May add declaration of new unchecked-excpetions */
	//void m1() throws NullPointerException{}
	//void m4() throws NullPointerException{}
	
	/* May choose not to declare checked/unchecked-exceptions
	 * from parent.*/
	//void m1(){}
	//void m4(){}
	
	/* May add new unchecked-exception declaration. */
	//void m1() throws NullPointerException{}
	//void m2() throws NullPointerException{}
	//void m3() throws NullPointerException{}
	//void m4() throws NullPointerException{}
	
	
}

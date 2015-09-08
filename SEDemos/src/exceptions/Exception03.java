package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {

}

class A03{
	void m1() throws IOException{}
	void m2() throws FileNotFoundException{}
	void m3() throws ClassCastException{}
	void m4() throws NumberFormatException{}
}

class B03 extends A03{
	
	/* Cannot add base-type of any exceptions declared in parent */
	//void m2() throws IOException{}
	
	/* Cannot declare Exception as thrown type */ 
	/*void m1() throws Exception{}
	void m2() throws Exception{}
	void m3() throws Exception{}*/
	
	/* Cannot add new checked-exceptions */
	//void m1() throws ClassNotFoundException{}
	
	/* May add declaration of new unchecked-excpetions */
	//void m1() throws NullPointerException{}
	//void m4() throws NullPointerException{}
	
	/* May choose not to declare checked/unchecked-exceptions
	 * from parent.*/
	/* void m1(){}
	void m4(){}*/
	
	/* May both declare new unchecked-exception and not 
	 * declare exceptions from base.
	 */
	/*void m1() throws NullPointerException{}
	void m2() throws NullPointerException{}
	void m3() throws NullPointerException{}
	void m4() throws NullPointerException{}*/
	
	
}

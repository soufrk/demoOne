package exceptions;

import java.io.IOException;

/**
 * Demonstrates that under no circumstance can Exception be added
 * as thrown while over-riding. Be it Checked/Unchecked.
 * 
 * Since this leads to broadening of an exception declaration.
 * @author soufrk
 *
 */
public class Exception02 {

}


class A{
	void m1() throws NullPointerException{}
	void m2() throws IOException{}
	void m3() {}
}

class B extends A{
	//void m1() throws Exception{}
	//void m2() throws Exception{}
	//void m3() throws Exception{}
}

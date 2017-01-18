package exceptions;

import java.io.IOException;

/**
 * Demonstrates that under no circumstance can a base-type exception
 * be declared as thrown while over-riding. Be it Checked/Unchecked.
 * @author souvik.goswami
 *
 */
public class Exception10 {

}


class A{
	void m1() throws NullPointerException{}
	void m2() throws IOException{}
}

class B extends A{
	/*void m1() throws Exception{}
	void m2() throws Exception{}*/
}
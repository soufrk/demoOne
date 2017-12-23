package interfaces;

/**
 * Any problems with this ?
 * 
 * @author soufrk
 *
 */
public class OverridingInterfaceMethodProblem implements MyInterface002 {

    public void print(String s) {
	System.out.println(s);
    }

    public void print(Integer i) {
	System.out.println(i);
    }

    public int print(String i) {
	return i;
    }

}

interface MyInterface002 {
    void print(String s);
}
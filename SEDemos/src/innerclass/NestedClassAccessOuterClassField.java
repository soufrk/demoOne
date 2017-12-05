package innerclass;

/**
 * Predict the output.
 * 
 * @author soufrk
 *
 */
public class NestedClassAccessOuterClassField {
    
    int x;

    public static void main(String[] args) {
	Inner i = new Inner();
	i.print();
    }
    
    static class Inner{
	public void print(){
	    System.out.println("x=" + x);	    
	}
    }

}

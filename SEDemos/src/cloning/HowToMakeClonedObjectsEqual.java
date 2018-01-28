package cloning;

/**
 * So, how do we render a cloned instance of a class
 * equal from the one cloned.
 * 
 * @author soufrk
 *
 */
public class HowToMakeClonedObjectsEqual implements Cloneable {

    public static void main(String[] args) {
	HowToMakeClonedObjectsEqual object1 = new HowToMakeClonedObjectsEqual();
	try {
	    HowToMakeClonedObjectsEqual object2 = (HowToMakeClonedObjectsEqual) object1.clone();
	    System.out.println(object2.equals(object1));
	    // But this does not yield expected result
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
    }
    
    @Override
    public boolean equals(Object obj) {
	boolean result = false;
	result = obj.getClass().equals(this.getClass());
	// But this will make any two instances of class
	// equal.
        return result;
        // Hence, it's essential to understand the contract
        // of Cloneable interface completely.
    }

}

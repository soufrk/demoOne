package cloning;

/**
 * Object cannot be clone without implementing Cloneable interface.
 * 
 * @author soufrk
 *
 */
public class CloneWithoutCloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
	CloneWithoutCloneable anInstance = new CloneWithoutCloneable();
	CloneWithoutCloneable anotherInst = (CloneWithoutCloneable) anInstance.clone();
    }

}

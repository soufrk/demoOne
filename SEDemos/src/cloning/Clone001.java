package cloning;

/**
 * Object cannot be clone without implementing Cloneable interface.
 * @author soufrk
 *
 */
public class Clone001 /*implements Cloneable*/{

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone001 anInstance = new Clone001();
		Clone001 anotherInst = (Clone001) anInstance.clone();

	}

}

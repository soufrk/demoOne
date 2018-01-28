package cloning;

/**
 * So if an object is cloned,<ul>
 * <li>are the two objects same ?</li>
 * <li>does the cloned become equal to the real object?</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class AreClonedObjectsEqual implements Cloneable {

    public static void main(String[] args) {
	AreClonedObjectsEqual object1 = new AreClonedObjectsEqual();
	try {
	    AreClonedObjectsEqual object2 = (AreClonedObjectsEqual) object1.clone();
	    System.out.println(object1 == object2);
	    System.out.println(object1.equals(object2));
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
    }

}

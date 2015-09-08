package generics;

/**
 * Simple Generic construct. Type information has to be specified<ul>
 * <li> either at class
 * level, or</li>
 * <li>at method level</li>
 * </ul>
 * @author souvik.goswami
 *
 */
public class Gen001 {
	
	//public void printObject(T t){}

	public <T>void printObject(T t){}
	
	//public <T>void printObject(Class<T extends Object> e){}
	
	public <T>void printObject(Class<T> t){}
	
	//public void printObject(Class<? extends Object> e) {}

}

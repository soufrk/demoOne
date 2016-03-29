package interfaces;

/**
 * What if same method is obtained from an interface and an abstract class ??
 * @author soufrk
 *
 */
public class InterfaceConfusion {

	public static void main(String args[]){
		RealClass real = new RealClass();
		real.go();
	}
}

/**
 * Simple interface
 */
interface AnInterface {
	int i = 10;
	void go();
}

/**
 * Simple abstract class. 
 */
abstract class AnAbstractClass{
	int i = 20;
	//public abstract void go();
	protected abstract void go();
}

/*abstract class AnAbstractClass implements AnInterface{
	int i = 20;
	//public abstract void go();
	protected abstract void go();
}*/

/**
 * Concrete class implements both interface & abstract class to create confusion. 
 */
class RealClass extends AnAbstractClass implements AnInterface{

	@Override
	public void go() {
	//protected void go() {
		//System.out.println(i);//The field i is ambiguous
		System.out.println(AnInterface.i);
		System.out.println(super.i);
	}
	
}

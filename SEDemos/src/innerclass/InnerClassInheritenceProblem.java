package innerclass;

/**
 * So, can an anonymous class
 * <ul>
 * <li>inherit multiple interfaces ?</li>
 * <li>extend a class and implement an interface ?</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class InnerClassInheritenceProblem {

    public static void main(String[] args) {
	Runnable r = new Runnable() implements Serializable {
	    @Override
	    public void run() {
		System.out.println("Hello");
	    }
	};

	MyInner07 reference = new MyInner07() implements Runnable{};

    }

}

class MyInner09 {
}

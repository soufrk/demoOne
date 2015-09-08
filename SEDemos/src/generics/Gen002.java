package generics;

/**
 * Declaring a class as generic, with generic method.
 * @author souvik.goswami
 *
 * @param <E>
 */
public class Gen002 {
// Declares the class as Generic with any Object
	
//public class Gen002<E extends Object> {
// Declares the object as Generic with a specific Hierarchy

	public static void main(String[] args) {
		//Gen002<BaseParent> obj = new Gen002<BaseParent>();
		//Gen002 obj = new Gen002<BaseParent>();
		Gen002 obj = new Gen002();
		
		BaseParent obj1 = new BaseParent();
		BaseChild1 obj2 = new BaseChild1();
		BaseChild2 obj3 = new BaseChild2();
		BaseParent obj4 = new BaseChild1();
		String obj5 = new String();
		
		obj.printObject(obj1);
		obj.printObject(obj2);
		obj.printObject(obj3);
		obj.printObject(obj4);
		/*
		 * Throws type-safety check error. We have restricted the type
		 * of Classes whose objects can be used with printObject()
		 * method. 
		 */
		//obj.printObject(obj5);
		
	}
	
	public <E> void printObject(E e){
		System.out.println(e.getClass());
	}

}

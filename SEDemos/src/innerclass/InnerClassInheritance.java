package innerclass;

/**
 * So, can an anonymous class<ul>
 * <li>extend a class that already implements an interface ?</li>
 * <li>extends an an abstract class ??</li>
 * <li>extends an an abstract class implementing an interface ?</li>
 * </ul>
 * @author soufrk
 *
 */
public class InnerClassInheritance {

	public static void main(String[] args) {
		MyInner10 referenceA = new MyInner10(){
			@Override
			public void show() {
				System.out.println("Anonymous subclass of MyInner10 implements MyInterface10.");
			}
		};
		referenceA.show();
		
		MyInnerAbstract10 referenceB = new MyInnerAbstract10() {
			@Override
			void show() {
				System.out.println("Anonymous subclass of MyInnerAbstract10 shows.");
			}
			
			@Override
			void display(){
				System.out.println("Anonymous subclass of MyInnerAbstract10 can also display.");
			}
		};
		referenceB.show();
		referenceB.display();
		
		MyInnerAbstractClass10 referenceC = new MyInnerAbstractClass10() {
			@Override
			public void show() {
				System.out.println("Anonymous subclass of MyInnerAbstractClass10 might show.");
			}
			@Override
			void print() {
				System.out.println("Anonymous subclass of MyInnerAbstractClass10 has to print.");
			}
			@Override
			void display(){
				System.out.println("Anonymous subclass of MyInnerAbstractClass10 can also display.");
			}
		};
		referenceC.print();
		referenceC.display();
		referenceC.show();

	}

}

interface MyInterface10{
	void show();
}

class MyInner10 implements MyInterface10{
	@Override
	public void show() {
		System.out.println("MyInner10 implements MyInterface10 to show");
	}
}

abstract class MyInnerAbstract10{
	abstract void show();
	void display(){
		System.out.println("Abstract class MyInnerAbstract10 displays.");
	}
}

abstract class MyInnerAbstractClass10 implements MyInterface10{
	abstract void print();
	void display(){
		System.out.println("Abstract class MyInnerAbstract10 displays.");
	}
	@Override
	public void show(){
		System.out.println("MyInnerAbstractClass10 implements MyInterface10 to show");
	}
}

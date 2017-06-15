package collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * What do you think should be the output ?
 * @author souvik.goswami
 *
 */
public class ClassicTreeSet {

	public static void main(String[] args) {
		Set<MyClass> mySet = new TreeSet<>();
		
		MyClass a = new MyClass();
		MyClass b = new MyClass();
		
		mySet.add(a);
		mySet.add(b);
		
		System.out.println(mySet.iterator().next());
	}

}

class MyClass{
	int id;
	String name;
}

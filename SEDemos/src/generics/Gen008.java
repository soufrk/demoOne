package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Bounded wildcard.
 * 
 * Earlier we saw upper bounded wildcard type generic. 
 * 
 * Let's see Lower Bounded, where the type of Parameter is 
 * limited to subclass of a particular type. 
 * @author souvik.goswami
 *
 */
public class Gen008 {

	public static void main(String[] args) {
		
		MyLowerBounded<? super Child2208> mybounds = null;
		mybounds = new MyLowerBounded<Child1008>();		
		mybounds = new MyLowerBounded<BaseParent008>();
		mybounds = new MyLowerBounded<Object>();
		
		List<? super Child2208> listOfNumbers;
		listOfNumbers = new LinkedList<BaseParent008>();
		
	}

}

class MyLowerBounded<T>{
	public void printValue(T t){
		System.out.println(t.toString());
	}
}

class BaseParent008{}

class Child1008 extends BaseParent008{}
class Child2008 extends BaseParent008{}

class Child1108 extends Child1008{}
class Child1208 extends Child1008{}

class Child2108 extends Child1008{}
class Child2208 extends Child1008{}
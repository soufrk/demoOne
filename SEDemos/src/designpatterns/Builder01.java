package designpatterns;

/**
 * Does this look like a builder ?
 * @author soufrk
 *
 */
public class Builder01 {

	public static void main(String[] args) {
		new Builder01().printOne().printTwo();
	}
	
	public void printOne(){
		System.out.println("One");
	}
	
	public void printTwo(){
		System.out.println("Two");
	}

}

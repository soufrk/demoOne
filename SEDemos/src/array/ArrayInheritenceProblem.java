package array;

/**
 * Does this compile ?
 * 
 * @author soufrk
 *
 */
public class ArrayInheritenceProblem {

    public static void main(String[] args) {
	Integer[] myArr = new Integer[1];
	myArr[0] = 1;
	method(myArr);
	for(int i=0; i<myArr.length;i++) {
	    System.out.println(myArr[i]);
	}
    }
    
    public static void method(Number[] numbers) {
	numbers[0] = 1.7345;
    }

}

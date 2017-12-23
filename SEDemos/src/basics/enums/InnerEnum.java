package basics.enums;

/**
 * Can enums be declared inside a method ?
 * 
 * @author soufrk
 *
 */
public class InnerEnum {

    public static void main(String[] args) {
	enum myEnum{
	    ONE, TWO, THREE;
	}
	myEnum e = myEnum.ONE;
    }

}

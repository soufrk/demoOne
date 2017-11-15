package basics.enums;

/**
 * Properties of an enum constant. toString() will return the name of
 * enum-constant; same as returned by name().
 * 
 * @author soufrk
 *
 */
public class EnumProperties {

    private static enum MyEnum {
	ONE, TWO, THREE, TWENTY_FOUR;
    }

    public static void main(String[] args) {
	for (MyEnum e : MyEnum.values()) {
	    System.out.println(e);
	    System.out.println(e.name());
	    System.out.println(e.getClass());
	    System.out.println(e.getDeclaringClass());
	}
    }

}

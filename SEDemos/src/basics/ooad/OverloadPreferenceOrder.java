package basics.ooad;

/**
 * Simple would be to predict which overloaded method version is invoked. Guess,
 * the 2nd preferred overload signature type, or maybe the 3rd.
 * 
 * @author soufrk
 *
 */
public class OverloadPreferenceOrder {

    public static void main(String[] args) {
	print(10);
    }
    
    public static void print(Integer i){System.out.println("Integer Value=" + i);}
    public static void print(short i){System.out.println("short Value=" + i);}
    public static void print(long i){System.out.println("long Value=" + i);}
    public static void print(int i){System.out.println("int Value=" + i);}
    public static void print(int ...i){System.out.println("int[] Value=" + i[0]);}
    public static void print(char i){System.out.println("char Value=" + i);}

}

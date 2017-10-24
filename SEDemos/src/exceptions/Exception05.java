package exceptions;

import java.io.IOException;

/**
 * Exception class is an unchecked-exception when declared in catch, but checked
 * when extended, as of JDK 7.
 * 
 * @author souvik.goswami
 *
 */
public class Exception05 {

    public static void main(String[] args) {

	try {}
	/*
	 * You cannot declare a checked Exception to be thrown from nowhere.
	 */
	catch (IOException e) {}
	catch (InterruptedException e) {}
	/*
	 * But, you can declare Exception to be thrown out from nowhere.
	 */
	catch (Exception e) {}
	/*
	 * Again, if Exception class is extended it does not result into
	 * unchecked exception.
	 */
	methodA();
	methodB();

    }

    static void methodA() throws Exception {}
    static void methodB() throws IOException {}
    static void methodC() throws InterruptedException {}

}

package exceptions;

import java.io.IOException;

/**
 * Exception class is an unchecked-exception in itself, as of JDK 7 when used in
 * catch block.
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
		 * Furthermore,
		 */
		try {
			methodA();
			methodB();
		} catch (IOException e) {}
		  catch (Exception e) {
		}

	}

	static void methodA() throws Exception {
	}

	static void methodB() throws IOException {
	}

	static void methodC() throws InterruptedException {
	}

}

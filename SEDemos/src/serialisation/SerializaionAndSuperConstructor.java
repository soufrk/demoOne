package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Demonstrates that for serialisation to work,
 * <ul>
 * <li>access to no-arg constructor of 1st non-serializable super-class is
 * needed</li>
 * </ul>
 * 
 * @author souvik.goswami
 *
 */
public class SerializaionAndSuperConstructor {

    public static void main1(String[] args) throws IOException {
	ObjectOutputStream oOut = null;
	FileOutputStream fileOut = null;
	String fileName = "output2.ser";
	MyChild2 cla = new MyChild2(10);
	try {
	    fileOut = new FileOutputStream(fileName);
	    ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    out.writeObject(cla);
	} catch (Exception cause) {
	    cause.printStackTrace();
	} finally {
	    if (oOut != null) {
		oOut.close();
		fileOut.close();
	    }
	}
    }

    public static void main2(String[] args) {
	String fileName = "output2.ser";
	try {
	    FileInputStream fileIn = new FileInputStream(fileName);
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    MyChild2 obj = (MyChild2) in.readObject();
	    System.out.println(obj);
	    in.close();
	    fileIn.close();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
}

class MyPrivate2 {
    private int x = 10;
    protected int y = 11;

    public MyPrivate2(int x) {
    }
}

class MyChild2 extends MyPrivate2 implements Serializable {
    public MyChild2(int x) {
	super(x);
    }

    private int x = 10;

    @Override
    public String toString() {
	return "MyChild2 [x=" + x + "]";
    }
}
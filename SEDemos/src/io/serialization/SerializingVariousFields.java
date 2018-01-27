package io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * Demonstrates a simple example of Serialization, suggesting the following
 * <ul>
 * <li>default all non-transient fields serializable.</li>
 * <li>static fields are not serialized, although they may appears to be
 * serialized when used under same JVM.</li>
 * </ul>
 * 
 * @author souvik.goswami
 *
 */
public class SerializingVariousFields {

    // WRITING OBJECT
    public static void main1(String[] args) throws IOException {
	ObjectOutputStream oOut = null;
	FileOutputStream fileOut = null;
	String fileName = "output.ser";
	MyPrivate cla = new MyPrivate();
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

    // WRITE ALTERING STATIC
    public static void main2(String[] args) throws IOException {
	ObjectOutputStream oOut = null;
	FileOutputStream fileOut = null;
	String fileName = "output.ser";
	try {
	    System.out.println("Initially");
	    MyPrivate cla = new MyPrivate();
	    System.out.println(cla);
	    System.out.println("Changing static field");
	    MyPrivate.changeStaticFieldValue();
	    System.out.println(cla);
	    System.out.println("Now, serializing");
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

    // READING OBJECT
    public static void main3(String[] args) {
	String fileName = "output.ser";
	try {
	    FileInputStream fileIn = new FileInputStream(fileName);
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    MyPrivate obj = (MyPrivate) in.readObject();
	    System.out.println(obj);
	    in.close();
	    fileIn.close();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    // READ STATIC BEFORE DESERIALISATION
    public static void main4(String[] args) {
	String fileName = "output.ser";
	try {
	    FileInputStream fileIn = new FileInputStream(fileName);
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    System.out.println(MyPrivate.w);
	    MyPrivate obj = (MyPrivate) in.readObject();
	    System.out.println(obj);
	    in.close();
	    fileIn.close();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

}

class MyPrivate implements Serializable {
    private int x = 10;
    protected int y = 11;
    int z = 12;
    static int w = 13;
    public int a = 14;

    /*@Override
    public String toString() {
	return "MyPrivate [x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + ", a=" + a + "]";
    }*/

    public static void changeStaticFieldValue() {
	w++;
	System.out.println("Current value of w=" + w);
    }

    @Override
    public String toString() {
	return "MyPrivate [y=" + y + ", z=" + z + ", w=" + w + ", a=" + a + "]";
    }

}
package io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Predict what value gets printed as output.
 * 
 * @author soufrk
 *
 */
public class ObjectOverwrite {

    public static void main(String[] args) {
	MyClass obj = new MyClass();
	obj.x = 10;
	obj.y = 20.0d;
	obj.z = "A";
	
	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("MyClass.ser"))){
	    out.writeObject(obj);
	    obj.x = 11;
	    out.writeObject(obj);
	} catch(IOException e){
	    e.printStackTrace();
	}
	
	try(ObjectInputStream out = new ObjectInputStream(new FileInputStream("MyClass.ser"))){
	    obj = (MyClass) out.readObject();
	    System.out.println(obj.x);
	} catch(IOException | ClassNotFoundException e){
	    e.printStackTrace();
	}
    }

}

class MyClass implements Serializable{

    private static final long serialVersionUID = 7673510498952169540L;
    
    int x;
    double y;
    String z;
    
}
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * So what happens if a class is serialized composed of non-serialized
 * reference.
 * 
 * @author soufrk
 *
 */
public class CompositionNotSerialized implements Serializable {

    private static final String FILE_NAME = "abc.ser";
    private static final long serialVersionUID = 1L;
    private MyClass01 instance;
    
    public CompositionNotSerialized(MyClass01 instance) {
	this.instance = instance;
    }

    public static void main(String[] args) {
	MyClass01 writeObject = new MyClass01(1, "A");
	CompositionNotSerialized composed = new CompositionNotSerialized(writeObject);
	try(ObjectOutputStream oOs = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
	    oOs.writeObject(composed);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
	try(ObjectInputStream oOs = new ObjectInputStream(new FileInputStream(FILE_NAME))){
	    CompositionNotSerialized readObject  = (CompositionNotSerialized) oOs.readObject();
	    System.out.println(readObject);
	} catch (IOException | ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public String toString() {
	return "CompositionNotSerialized [instance=" + instance + "]";
    }

}

class MyClass01 {
    int id;
    String name;
    public MyClass01(int id, String name) {
	this.id = id;
	this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
	return "MyClass [id=" + id + ", name=" + name + "]";
    }
    
}

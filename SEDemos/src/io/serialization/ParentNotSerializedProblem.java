package io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Guess the output, or outcome !!
 * 
 * @author soufrk
 *
 */
public class ParentNotSerializedProblem {
    
    private static final String FILE_NAME = "abc.ser";

    public static void main(String[] args) {
	try(ObjectOutputStream oOs = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
	    MyChild object  = new MyChild(1, "A");
	    oOs.writeObject(object);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
	try(ObjectInputStream oOs = new ObjectInputStream(new FileInputStream(FILE_NAME))){
	    MyChild object  = (MyChild) oOs.readObject();
	    object.setEmail("abc@def.com");
	    System.out.println(object);
	} catch (IOException | ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }

}

class MyParent{
    int id;
    String name;
    public MyParent(int id, String name) {
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

class MyChild extends MyParent implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String email;

    public MyChild(int id, String name) {
	super(id, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
	return "MyChild [email=" + email + ", id=" + id + ", name=" + name + "]";
    }
    
}

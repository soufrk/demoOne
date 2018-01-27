package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Can a class be serialized without having it marked as
 * serializable.
 * 
 * If not what would ne the exception.
 * 
 * @author soufrk
 *
 */
public class NonSerializedObjectWrite {
    
    private static final String FILE_NAME = "abc.ser";
    
    public static void main(String[] args) {
	try(ObjectOutputStream oOs = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
	    MyClass object  = new MyClass(1, "A");
	    oOs.writeObject(object);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}

class MyClass{
    int id;
    String name;
    public MyClass(int id, String name) {
	super();
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

package cloning;

/**
 * Given that the code doesn't compile, predict where it fails.
 * And why, of course.
 * 
 * @author soufrk
 *
 */
public class CloningInHierarchyProblem {

    public static void main(String[] args) {
	Child c1 = new Child(1);
	c1.setName("A");
	try{
	    Child c2 = (Child) c1.clone();
	    System.out.println(c2);
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
    }

}

class Base {
    
    protected int id;

    public Base(int id) {
	super();
	this.id = id;
    }

    public int getId() {
	return id;
    }

    @Override
    public String toString() {
	return "Base [id=" + id + "]";
    }
}

class Child extends Base implements Cloneable{
    
    private String name;

    public Child(int id) {
	super(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
	return "Child [name=" + name + ", id=" + id + "]";
    }
    
}

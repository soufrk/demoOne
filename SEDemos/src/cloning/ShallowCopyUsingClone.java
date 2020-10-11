package cloning;

import java.util.List;

/**
 * Add problem statement
 *
 */
public class ShallowCopyUsingClone {

    public static void main(String[] args) throws CloneNotSupportedException {
	ContactDetails c = new ContactDetails();
	c.setAddress("ABC");
	c.setEmail("abc@def.com");
	Employee e = new Employee();
	e.setName("DEF");
	e.setC(c);
	
	Employee eClone = (Employee) e.clone();
	System.out.println(eClone.getC() == e.getC());
	System.out.println(eClone.equals(e));
	e.getC().setAddress("XYZ");
	System.out.println(eClone.getC().getAddress());
    }

    static class Employee implements Cloneable {
	String name;
	Department d;
	ContactDetails c;

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public Department getD() {
	    return d;
	}

	public void setD(Department d) {
	    this.d = d;
	}

	public ContactDetails getC() {
	    return c;
	}

	public void setC(ContactDetails c) {
	    this.c = c;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
    }

    static class Department {
	String name;
	String id;

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

    }

    static class ContactDetails {
	private Long version;
	String address;
	List<String> contactNumbers;
	String email;
	
	public ContactDetails() {
	    version = System.currentTimeMillis();
	}

	public String getAddress() {
	    return address;
	}

	public void setAddress(String address) {
	    this.address = address;
	}

	public List<String> getContactNumbers() {
	    return contactNumbers;
	}

	public void setContactNumbers(List<String> contactNumbers) {
	    this.contactNumbers = contactNumbers;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if(!(obj instanceof ContactDetails))
		return false;
	    ContactDetails c = (ContactDetails) obj;
	    if(!c.address.equals(address))
		return false;
	    if(!c.email.equals(email))
		return false;
	    if(!c.contactNumbers.equals(contactNumbers))
		return false;
	    if(!c.version.equals(version))
		return false;
	    return true;
	}
	
	@Override
	public int hashCode() {
	    return version.hashCode() + address.hashCode() + email.hashCode() + version.hashCode();
	}

    }

}

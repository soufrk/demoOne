package streams;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Use of sorted() and distinct()
 * 
 * Given that there will be an exception in the code, predict the line and type
 * of exception.
 * 
 * @author soufrk
 */
public class Streams007 {

    public static void main(String[] args) {
	// Initialize Calendar instance
	Calendar calendar = GregorianCalendar.getInstance();
	calendar.set(1989, 9, 10);
	Employee e1 = new Employee(1L, "AMIT", calendar.getTime());
	calendar.set(1990, 5, 28);
	Employee e2 = new Employee(2L, "SANEEP", calendar.getTime());
	calendar.set(1988, 3, 1);
	Employee e3 = new Employee(3L, "SANDEEP", calendar.getTime());
	Employee e4 = new Employee(4L, "SANDEEP", calendar.getTime());
	// Create list of employee objects
	List<Employee> listOfEmployees = new LinkedList<>();
	listOfEmployees.add(e1);
	listOfEmployees.add(e2);
	listOfEmployees.add(e3);
	listOfEmployees.add(e4);
	// Print elements in a sorted stream
	listOfEmployees.stream().sorted().peek(System.out::println);
	// Count elements in the stream
	listOfEmployees.stream().sorted().count();
    }

    // Employee class
    private static class Employee {
	Long id;
	String name;
	Date dateOfBirth;

	public Employee(Long id, String name, Date dateOfBirth) {
	    this.id = id;
	    this.name = name;
	    this.dateOfBirth = dateOfBirth;
	}

	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public Date getDateOfBirth() {
	    return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
	    this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
	    return "Employee{id:" + id + ", name:" + name + ", dateOfBirth:" + dateOfBirth + "}";
	}

    }

}

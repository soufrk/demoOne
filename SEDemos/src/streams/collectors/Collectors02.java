package streams.collectors;

import java.util.List;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Using Collector to create a particular implementation of a Collection.
 *
 * @Author soufrk
 */
public class Collectors02 {

    public static void main1(String[] args) {
	Calendar calendar = GregorianCalendar.getInstance();
	calendar.set(1989, 9, 10);
	Employee e1 = new Employee(1L, "AMIT", calendar.getTime());
	calendar.set(1990, 5, 28);
	Employee e2 = new Employee(2L, "SANEEP", calendar.getTime());
	calendar.set(1988, 3, 1);
	Employee e3 = new Employee(3L, "SANDEEP", calendar.getTime());
	calendar.set(1989, 12, 1);
	Employee e4 = new Employee(4L, "PUNEET", calendar.getTime());
	List<Employee> listOfEmployees = new LinkedList<>();
	listOfEmployees.add(e1);
	listOfEmployees.add(e2);
	listOfEmployees.add(e3);
	listOfEmployees.add(e4);
	// Fileter elemnts younger than 1990
	calendar.set(1990, 0, 0);

	Deque<Employee> m = listOfEmployees.stream().peek(System.out::println)
		.filter(u -> calendar.getTime().after(u.getDateOfBirth()))
		// .collect(Collectors.toList());
		.collect(Collectors.toCollection(LinkedList::new));
	System.out.println(m);
    }

    public static void main(String... args) {
	List<Integer> listOfNumbers = Arrays.asList(1, 4, 9, 16, 21, 28, 4, 5, 10, 15, 16);
	NavigableSet<Integer> m = listOfNumbers.stream().filter(u -> u > 5)
		.collect(Collectors.toCollection(TreeSet::new));
	System.out.println(m.size());
    }

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
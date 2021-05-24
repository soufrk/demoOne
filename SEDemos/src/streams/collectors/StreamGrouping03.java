package streams.collectors;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Counting and Joining using Collector with custom class.
 */
public class StreamGrouping03 {

    public static void main(String[] args) {
	Calendar calendar = GregorianCalendar.getInstance();
	calendar.set(1989, 9, 10);
	Employee e1 = new Employee(1L, "AMIT", calendar.getTime(), 5000.00);
	calendar.set(1990, 5, 28);
	Employee e2 = new Employee(2L, "SANEEP", calendar.getTime(), 6500.00);
	calendar.set(1988, 3, 1);
	Employee e3 = new Employee(3L, "SANDEEP", calendar.getTime(), 5500.00);
	calendar.set(1989, 12, 1);
	Employee e4 = new Employee(4L, "PUNEET", calendar.getTime(), 5750.00);
	calendar.set(1989, 07, 12);
	Employee e5 = new Employee(4L, "SUMIT", calendar.getTime(), 6250.00);
	List<Employee> listOfEmployees = Arrays.asList(e1, e2, e3, e4, e5);
	// 1. Counting elements
	Long count = listOfEmployees.stream().collect(Collectors.counting());
	System.out.println("Count=" + count);
	// 2. Joining as String
	String joinedResult = listOfEmployees.stream().map(Object::toString)
		.collect(Collectors.joining(",\n    ", "[\n    ", "\n]"));
	System.out.println(joinedResult);
	// 3. Finding maximum value
	Optional<Employee> e = listOfEmployees.stream()
		.collect(Collectors.maxBy((v1, v2) -> v1.getId().compareTo(v2.getId())));
	e.ifPresent(employee -> System.out.println("Maximum:" + employee));
	// 4. Finding minimum value
	// System.out.println("Minimum:" +
	// listOfEmployees.stream().collect(Collectors.minBy((v1,v2)->v1.getId()-v2.getId())));
	listOfEmployees.stream().collect(Collectors.minBy((v1, v2) -> v1.getId().compareTo(v2.getId())))
		.ifPresent(employee -> System.out.println("Minimum:" + employee));
    }

    private static class Employee {
	Long id;
	String name;
	Date dateOfBirth;
	Double salary;

	public Employee(Long id, String name, Date dateOfBirth, Double salary) {
	    this.id = id;
	    this.name = name;
	    this.dateOfBirth = dateOfBirth;
	    this.salary = salary;
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

	public void setSalary(Double salary) {
	    this.salary = salary;
	}

	public Double getSalary() {
	    return this.salary;
	}

	@Override
	public String toString() {
	    return "Employee{id:" + id + ", name:" + name + ", dateOfBirth:" + dateOfBirth + "}";
	}

    }

}

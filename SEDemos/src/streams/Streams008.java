package streams;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Use of sorted() and distinct()
 *  Needs rework
 * 
 * @author soufrk
 */
public class Streams008 {

	public static void main(String[] args) {
		// Initialize Calendar instance
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(1989, 9, 10);
		Employee e1 = new Employee(1L, "AMIT", calendar.getTime());
		calendar.set(1990, 5, 28);
		Employee e2 = new Employee(2L, "SANEEP", calendar.getTime());
		calendar.set(1988, 3, 1);
		Employee e3 = new Employee(3L, "SANDEEP", calendar.getTime());
		Employee e4 = new Employee(3L, "SANDEEP", calendar.getTime());
		List<Employee> listOfEmployees = new LinkedList<>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);

		long distinctElements = listOfEmployees.stream()
			.distinct()
			.peek(System.out::println)
			.count();
		System.out.println("Unique elements=" + distinctElements);
	}

	// Employee class
	private static class Employee implements Comparable<Employee> {
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
			return "Employee{id:" + id + 
				", name:" + name +
				", dateOfBirth:" + dateOfBirth +
				"}";
		}

		@Override
		public int compareTo(Employee e) {
			//return id.compareTo(e.getId()) + name.compareTo(e.getName()) + dateOfBirth.compareTo(e.getDateOfBirth());
			return name.compareTo(e.getName());
		}

	}

}

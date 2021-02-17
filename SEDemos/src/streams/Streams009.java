package streams;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Comparator;

/**
 * Creating Comparator using Lambda
 * sorted() and distinct()
 *
 * @author soufrk
 */
public class Streams009 {

    public static void main(String[] args) {
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

        /* Shorthand Lambda Comaparator */
        Comparator<Employee> c1 = (v1,v2)->v1.getDateOfBirth().compareTo(v2.getDateOfBirth());
        listOfEmployees.stream()
            .sorted(c1)
            .peek(System.out::println)
            .count();

        /* Shorthand Lambda Comaparator */
        Comparator<Employee> c2 = (v1,v2)->v1.getId().compareTo(v2.getId());
        listOfEmployees.stream()
            .sorted(c2)
            .forEach(System.out::println);

        /* In-line comparator, without declaration */
        listOfEmployees.stream()
            .sorted((v1,v2)->v1.getName().compareTo(v2.getName()))
            .forEach(System.out::println);

        /* Joining multiple comparators */
        Comparator<Employee> c3 = (v1,v2)->v1.getName().compareTo(v2.getName());
        listOfEmployees.stream()
            .sorted(c1.thenComparing(c3))
            .forEach(System.out::println);

        /* Reversing comparator */
        listOfEmployees.stream()
            .sorted(c1.reversed().thenComparing(c3))
            .forEach(System.out::println);

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
            return "Employee{id:" + id +
                ", name:" + name +
                ", dateOfBirth:" + dateOfBirth +
                "}";
        }

    }

}

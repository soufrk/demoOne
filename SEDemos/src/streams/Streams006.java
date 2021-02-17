package streams;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Comparing Elements in a Stream
 * Use of findFirst() Vs findAny()
 * Guess the outcome ?
 * @author soufrk
 */
public class Streams006 {

    public static void main(String[] args) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1989, 9, 10);
        Employee e1 = new Employee(1L, "AMIT", calendar.getTime());
        calendar.set(1990, 5, 28);
        Employee e2 = new Employee(2L, "SANEEP", calendar.getTime());
        calendar.set(1988, 3, 1);
        Employee e3 = new Employee(3L, "SANEEP", calendar.getTime());
        List<Employee> listOfEmployees = new LinkedList<>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        System.out.println(listOfEmployees.stream()
            .anyMatch(u->u.getId()>2));                       // Any match
        System.out.println(listOfEmployees.stream()
            .allMatch(u->u.getName().startsWith("A")));       // All match
        System.out.println(listOfEmployees.stream()
            .noneMatch(u->u.getName().trim().length()==0));   // None match
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
                "name:" + name +
                "dateOfBirth:" + dateOfBirth +
                "}";
        }

    }

}
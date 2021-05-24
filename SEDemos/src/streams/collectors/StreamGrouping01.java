package streams.collectors;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping01 {

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
        // Collect and print
        /*
        Map<Integer, List<Employee>> result = listOfEmployees.stream()
            .collect(Collectors.groupingBy(
                e->{
                    calendar.
                        setTime(e.getDateOfBirth());
        
                    return calendar.get(Calendar.YEAR);
                }
            ));
        System.out.println(result);
        */
        // Printing inline from Collected values
        /*
        listOfEmployees.stream()
        .collect(Collectors.groupingBy(
                e->{
                    calendar.
                    setTime(e.getDateOfBirth());
                    
                    return calendar.get(Calendar.YEAR);
                }
                ))
        .forEach((k,v)->System.out.format("%4d %s\n", k, v));
        */
        // Sum, Averaging on Group
        // Group By Year of Birth
        /*listOfEmployees.stream()
            .collect(Collectors.groupingBy(
                e->{
                    calendar.setTime(e.getDateOfBirth());
                    return calendar.get(Calendar.YEAR);
                },
                // Average by Year of Brith
                Collectors.averagingInt(
                    f->{
                        calendar.setTime(f.getDateOfBirth());
                        return Calendar.getInstance().get(Calendar.YEAR)-calendar.get(Calendar.YEAR);
                    }
                )
            ))
        .forEach((k,v)->System.out.format("%4d %s\n", k, v));
        */
        // Group by Year of Birth, sum of Salary
        listOfEmployees.stream()
            .collect(Collectors.groupingBy(
                e->{
                    calendar.setTime(e.getDateOfBirth());
                    return calendar.get(Calendar.YEAR);
                },
                Collectors.summingDouble(
                    Employee::getSalary
                )
            ))
        .forEach((k,v)->System.out.format("%4d %s\n", k, v));
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

import java.util.*;
import java.util.stream.*;

public class Main { 
    
    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Engineering"),
            new Employee("Bob", "HR"),
            new Employee("Charlie", "Engineering"),
            new Employee("Diana", "Finance")
        );

        System.out.println("Engineering Department Employees:");
        employees.stream()
                 .filter(e -> e.department.equals("Engineering"))
                 .map(e -> e.name)
                 .forEach(System.out::println);
    }
}

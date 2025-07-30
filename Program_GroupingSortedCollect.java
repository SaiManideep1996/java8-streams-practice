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
            new Employee("David", "Finance"),
            new Employee("Eva", "HR")
        );

        Map<String, List<Employee>> grouped = employees.stream()
                .sorted(Comparator.comparing(e -> e.name))
                .collect(Collectors.groupingBy(e -> e.department));

        grouped.forEach((dept, list) -> {
            System.out.println(dept + ":");
            list.forEach(emp -> System.out.println(" - " + emp.name));
        });
    }
}

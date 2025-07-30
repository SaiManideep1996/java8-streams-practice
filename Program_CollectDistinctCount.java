import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> departments = Arrays.asList(
            "HR", "Finance", "HR", "Engineering", "Engineering", "Sales"
        );

        // collect distinct departments
        List<String> uniqueDepartments = departments.stream()
                .distinct()
                .collect(Collectors.toList());

        // count unique
        long count = uniqueDepartments.size();

        System.out.println("Unique Departments: " + uniqueDepartments);
        System.out.println("Total Unique Departments: " + count);
    }
}

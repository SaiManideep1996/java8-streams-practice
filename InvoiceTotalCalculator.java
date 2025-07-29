import java.util.*;
import java.util.stream.*;

public class Main { 
    public static void main(String[] args) {
        List<Double> invoices = Arrays.asList(
            499.99,
            1299.50,
            320.75,
            150.0
        );

        double total = invoices.stream()
                               .reduce(0.0, Double::sum);  // Adds up all invoice amounts

        System.out.println("Total Invoice Amount: $" + total);
    }
}

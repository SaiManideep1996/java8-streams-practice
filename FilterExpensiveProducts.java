import java.util.*;
import java.util.stream.*;

public class Main {  // ✅ Make this the only public class
    // Model class inside Main (not public)
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200),
            new Product("Mouse", 25),
            new Product("Phone", 800),
            new Product("Monitor", 1500)
        );

        System.out.println("Products over $1000:");
        products.stream()
                .filter(p -> p.price > 1000)
                .forEach(p -> System.out.println(p.name + " - $" + p.price));
    }
}

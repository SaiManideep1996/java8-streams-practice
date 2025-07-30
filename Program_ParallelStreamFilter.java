import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> orders = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            orders.add(i);
        }

        orders.parallelStream()
              .filter(id -> id % 200 == 0)
              .forEach(id -> System.out.println("Processing Order: " + id + " - " + Thread.currentThread().getName()));
    }
}

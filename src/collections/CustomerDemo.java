package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDemo {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a", "e3"));
        customers.add(new Customer("b", "e2"));
        customers.add(new Customer("c", "e77"));

        Collections.sort(customers,new EmailComparator());
        System.out.println(customers);
    }
}

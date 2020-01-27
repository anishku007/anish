package demo.demoTest.stock;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {
    public int compare(Order o1, Order o2) {
        int result = Integer.compare(o1.getPrice(), o2.getPrice());
        if (result != 0) {
            return result;
        }
        return Integer.compare(o1.getId(), o2.getId());
        }
    }
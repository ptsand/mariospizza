import java.util.Comparator;

public class SortByLocalTime implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getFinishTime().compareTo(order2.getFinishTime());
    }
}
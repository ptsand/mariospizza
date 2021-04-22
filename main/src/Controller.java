import java.util.ArrayList;
import java.time.LocalTime;
public class Controller {

    private ArrayList<Order> orders = new ArrayList<Order>();
    private ArrayList<Order> ordersHistory = new ArrayList<Order>();

    private View view;

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public Controller(View view) {
        this.view = view;
    }

    public void setView(View view) {
        this.view = view;
        if (view.getController() == null) view.setController(this);
        view.print();
        view.handleInput();
    }

    public void createOrder(ArrayList<Pizza> pizzas, int timeOffset) {
        System.out.println("Pizzas chosen: " + pizzas);
        LocalTime timeOfOrder = LocalTime.now();
        LocalTime finishTime = timeOfOrder.plusMinutes(timeOffset);
        Order order = new Order(finishTime, timeOfOrder, pizzas);
        orders.add(order);
        ordersHistory.add(order);
        setView(SelectPizza.getInstance());
    }

    public void createOrder(Pizza pizza, int timeOffset) {
        System.out.println("Ordered pizza: "+ pizza);
        ArrayList<Pizza> chosenPizza = new ArrayList<Pizza>();
        chosenPizza.add(pizza);
        createOrder(chosenPizza, timeOffset);
    }

    public ArrayList<Order> getOrderHistory() {
        return this.ordersHistory;
    }
}

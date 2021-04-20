import java.util.ArrayList;
import java.time.LocalTime;

public class Controller {

    private ArrayList<String> orders = new ArrayList<String>(); // Change String to Order
    private ArrayList<String> customers = new ArrayList<String>(); // Change String to Customer
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void initialize() {
        loadPizzasFromFile("path 1");
        loadCustomersFromFile("path2");
    }

    public void setView(View view) {
        this.view = view;
        if (view.getController() == null) view.setController(this);
        view.print();
        view.handleInput();
    }

    public void createOrder(ArrayList<Pizza> pizzas, int timeOffset) {
        System.out.println("Pizzas chosen: " + pizzas);
        LocalTime createTime = LocalTime.now();
        LocalTime finishTime = createTime.plusMinutes(timeOffset);
        // Order order = new Order(createTime, finishTime, pizzas);
        // orders.add(order);
        setView(SelectPizza.getInstance());
    }

    public void createOrder(Pizza pizza, int timeOffset) {
        System.out.println("Ordered pizza: "+ pizza);
        ArrayList<Pizza> chosenPizza = new ArrayList<Pizza>();
        chosenPizza.add(pizza);
        createOrder(chosenPizza, timeOffset);
    }

    public void createCustomer(String customer) {

    }

    public void loadPizzasFromFile(String path) {

    }

    public void loadCustomersFromFile(String path) {

    }

}

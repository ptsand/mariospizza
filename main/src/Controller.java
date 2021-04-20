import java.util.ArrayList;

public class Controller {

    private ArrayList<String> orders = new ArrayList<String>(); // Change String to Order
    private ArrayList<String> customers = new ArrayList<String>(); // Change String to Customer
    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
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

    public void createOrder(ArrayList<Pizza> pizzas) {
        System.out.println("Orderlist: " + pizzas);
        setView(SelectPizza.getInstance());
    }

    public void createOrder(Pizza pizza) {
        System.out.println("Ordered pizza: "+ pizza);
        setView(SelectPizza.getInstance());
    }

    public void createCustomer(String customer) {

    }

    public void loadPizzasFromFile(String path) {

    }

    public void loadCustomersFromFile(String path) {

    }

}

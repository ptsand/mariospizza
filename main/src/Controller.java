import java.util.ArrayList;

public class Controller {

    private ArrayList<String> order = new ArrayList<String>(); // Change String to Order
    private ArrayList<String> customer = new ArrayList<String>(); // Change String to Customer
    private ArrayList<String> pizza = new ArrayList<String>(); // Change String to Pizza
    private View currentView;

    public Controller(View currentView) {
        this.currentView = currentView;
    }

    public void initialize() {
        currentView.print();
        currentView.handleInput();
    }

    public void createOrder(ArrayList<String> pizzas) {

    }

    public void createCustomer(String customer) {

    }

    public void loadPizzasFromFile(String path) {

    }

    public void loadCustomersFromFile(String path) {

    }

}

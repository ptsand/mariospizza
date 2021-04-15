import java.util.ArrayList;

public class Controller {

    private ArrayList<String> order = new ArrayList<String>(); // Change String to Order
    private ArrayList<String> customer = new ArrayList<String>(); // Change String to Customer
    private ArrayList<String> pizza = new ArrayList<String>(); // Change String to Pizza
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void setView(View currentView) {
        this.view = currentView;
        if (currentView.getController() == null) currentView.setController(this);
        currentView.print();
        currentView.handleInput();
    }

    public void initialize() {

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

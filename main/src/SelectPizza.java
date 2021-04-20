import java.util.ArrayList;
import java.util.Scanner;

public class SelectPizza implements View {

    private Controller controller;
    private static SelectPizza instance;
    private ArrayList<Pizza> pizzas = MenuKort.listenOverPizzaerne();

    public static SelectPizza getInstance(){
        if(instance == null){
            instance = new SelectPizza();
        }
        return instance;
    }

    public void setController(Controller c) {
        this.controller = c;
    }

    @Override
    public Controller getController() {
        return this.controller;
    }

    @Override
    public void print() {
        System.out.println("Please select pizza (enter q to quit or o for unfinished OrderList):");
        System.out.println("To add multiple pizzas use comma as delimiter (ex 0,1)");
        for (Pizza pizza : pizzas) {
            System.out.printf("%d, %s, %f",pizza.getNumber(),pizza.getDescription(),pizza.getPrice());
        }
    }

    @Override
    public void handleInput() {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();

        if (in.length() > 2) { /*
            ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
            for (String n : in.split(",")) {
                pizzas.add("n",);
            }
            controller.createOrder(pizzas); */
        } else if (in == "o") {
            System.out.print("Change to order View");
            controller.setView(OrderList.getInstance());
        } else if (in == "q") {
            System.out.println("Bye...");
            System.exit(0);
        } else {
            try {
                int number = Integer.parseInt(in);
                controller.createOrder(pizzas.get(number));
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, try again!");
            }
        }

    }
}

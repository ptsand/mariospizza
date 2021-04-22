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
        System.out.println("Please select pizza (enter q to quit or o for unfinished OrderList, h for order history):");
        System.out.println("To add multiple pizzas use comma as delimiter (ex 0,1)");
        for (Pizza pizza : pizzas) {
            System.out.printf("%d  %s  %.2f\n",pizza.getNumber(),pizza.getDescription(),pizza.getPrice());
        }
    }

    @Override
    public void handleInput() {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();
        // Order multiple pizzas with comma as delimiter
        if (in.length() > 2 && in.contains(",")) {
            ArrayList<Pizza> pizzasSelected = new ArrayList<Pizza>();
            // loop over numbers chosen
            for (String n : in.split(",")) {
                try {
                    int number = Integer.parseInt(n);
                    pizzasSelected.add(pizzas.get(number));
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input!");
                }
            }
            System.out.println("Enter time in minutes to finish order:");
            int minOffset = scan.nextInt();
            controller.createOrder(pizzasSelected, minOffset);
        } else if (in.equals("o")) {
            System.out.print("Change to order View");
            controller.setView(OrderList.getInstance());
        } else if (in.equals("h")) {
            System.out.print("Change to order history View");
            controller.setView(OrderHistory.getInstance());
        } else if (in.equals("q")) {
            System.out.println("Bye...");
            System.exit(0);
        } else {
            try {
                int number = Integer.parseInt(in);
                int minOffset = scan.nextInt();
                controller.createOrder(pizzas.get(number), minOffset);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
            }
        }

    }
}

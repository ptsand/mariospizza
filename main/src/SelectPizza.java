import java.util.ArrayList;
import java.util.Scanner;

public class SelectPizza implements View {

    private Controller controller;
    private static SelectPizza instance;

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
        System.out.println("0. pizza 0");
        System.out.println("1. pizza 1");
    }

    @Override
    public void handleInput() {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();
        if (in.length() > 2) {
            ArrayList<String> pizzas = new ArrayList<String>();
            for (String n : in.split(",")) {
                pizzas.add(n);
            }
            controller.createOrder(pizzas);
        } else {
        switch (in) {
            case "0":
                System.out.println("you selected pizza 0");
                controller.createOrder("0");
                break;
            case "1":
                System.out.println("you selected pizza 1");
                break;
            case "o":
                System.out.print("Change to order View");
                controller.setView(OrderList.getInstance());
                break;
            case "q":
                System.out.println("Bye...");
                System.exit(0);
        }
        }

    }
}

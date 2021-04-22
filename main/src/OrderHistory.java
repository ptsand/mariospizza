import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderHistory implements View {

    private Controller controller;
    private static OrderHistory instance;

    public static OrderHistory getInstance(){
        if(instance == null){
            instance = new OrderHistory();
        }
        return instance;
    }
    @Override
    public void print() {
        System.out.println("All orders: (enter o to see unfinished orders, a to make new order or q to quit)");
        ArrayList<Order> orders = getController().getOrderHistory();
        Collections.sort(orders, new SortByLocalTime());
        for (Order order : orders){
            System.out.printf("%s - %s\n", order.getFinishTime().toString(), order.getPizzasOrdered().toString());
        }
    }

    @Override
    public void handleInput() {
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "a":
                System.out.println("Going back");
                controller.setView(SelectPizza.getInstance());
                break;
            case "o":
                System.out.println("Going back");
                controller.setView(OrderList.getInstance());
                break;
            case "q":
                System.out.println("Bye...");
                System.exit(0);
            case "r":
                System.out.println("Please enter the order you wanna delete");
                controller.getOrders().remove(in.nextInt());
        }
    }

    @Override
    public void setController(Controller c) {
        this.controller = c;
    }

    @Override
    public Controller getController() {
        return this.controller;
    }
}

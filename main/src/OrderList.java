import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderList implements View {

    private Controller controller;
    private static OrderList instance;

    public static OrderList getInstance(){
        if(instance == null){
            instance = new OrderList();
        }
        return instance;
    }
    @Override
    public void print() {
        System.out.println("Unfinished Orders sorted by finishtime: \n(enter a to add order, r to remove a pizza, h for order history or q to quit)");
        ArrayList<Order> orders = getController().getOrders();
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
                System.out.println("Going to SelectPizza View...");
                controller.setView(SelectPizza.getInstance());
                break;
            case "r":
                System.out.println("Please enter the order you wanna delete");
                controller.getOrders().remove(in.nextInt());
                break;
            case "h":
                System.out.println("Going to order history View...");
                controller.setView(OrderHistory.getInstance());
                break;
            case "q":
                System.out.println("Bye...");
                System.exit(0);
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

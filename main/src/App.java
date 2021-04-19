public class App {

    public static void main(String[] args) {
        System.out.print("Pizzaer vi sælger: ");
        View menu = SelectPizza.getInstance();
        Controller controller = new Controller(menu);

        System.out.println();
        controller.initialize();
        controller.setView(menu);
        

    }
}
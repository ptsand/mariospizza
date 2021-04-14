public class App {

    public static void main(String[] args) {
        View menu = new SelectPizza();
        Controller controller = new Controller(menu);
        controller.initialize();
    }
}
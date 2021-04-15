public class App {

    public static void main(String[] args) {
        View menu = SelectPizza.getInstance();
        Controller controller = new Controller(menu);
        controller.initialize();
        controller.setView(menu);
    }
}
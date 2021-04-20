public class App {

    public static void main(String[] args) {
        MenuKort.listenOverPizzaerne();
        View menu = SelectPizza.getInstance();
        Controller controller = new Controller(menu);
        controller.setView(menu);
    }
}
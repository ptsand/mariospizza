public class App {

    public static void main(String[] args) {
        System.out.println(MenuKort.listenOverPizzaerne());
        View menu = SelectPizza.getInstance();
        Controller controller = new Controller(menu);
        controller.initialize();
        controller.setView(menu);
        

    }
}
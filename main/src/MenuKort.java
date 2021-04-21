import java.util.ArrayList;


public class MenuKort {
    public static ArrayList listenOverPizzaerne() {
        ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
        pizzaList.add(new Pizza(1, "Ost og bacon ", 100));
        pizzaList.add(new Pizza(2, "pepperoni med dressing ", 100));
        pizzaList.add(new Pizza(2, "pepperoni med dressing ", 100));
        return pizzaList;

    }
}

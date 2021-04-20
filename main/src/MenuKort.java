import java.util.ArrayList;


public class MenuKort {
    public static ArrayList listenOverPizzaerne() {
        ArrayList<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(new Pizza("Nummer 0:", "Ost og skinke ", 65));
        pizzaList.add(new Pizza("Nummer 1:", "Ost og bacon ", 100));

        pizzaList.forEach(System.out::println);

        return pizzaList;

    }
}

import java.util.ArrayList;


public class MenuKort {
    public static String listenOverPizzaerne(){
        ArrayList<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(new Pizza(0,"Ost og skinke ", 65));
        pizzaList.add(new Pizza(1,"Ost og bacon ", 100));
        return pizzaList.toString();

    }
}

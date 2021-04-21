import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order {
    private LocalTime finishTime;
    private LocalTime timeOfOrder;
    private ArrayList<Pizza> pizzasOrdered;

    public Order(LocalTime finishTime, LocalTime timeOfOrder, ArrayList<Pizza> pizzasOrdered){
        this.finishTime = finishTime;
        this.timeOfOrder = timeOfOrder;
        this.pizzasOrdered = pizzasOrdered;
    }
    public LocalTime getFinishTime(){return finishTime;}

    public LocalTime getTimeOfOrder(){return timeOfOrder;}

    public ArrayList<Pizza> getPizzasOrdered(){return pizzasOrdered;}
}

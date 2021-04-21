public class Order {
    private int finishTime;
    private int timeOfOrder;
    private Pizza pizzasOrdered;

    public Order(int finishTime, int timeOfOrder, Pizza pizzasOrdered){
        this.finishTime = finishTime;
        this.timeOfOrder = timeOfOrder;
        this.pizzasOrdered = pizzasOrdered;
    }
    public int getFinishTime(){return finishTime;}

    public int getTimeOfOrder(){return timeOfOrder;}

    public Pizza getPizzasOrdered(){return pizzasOrdered;}
}

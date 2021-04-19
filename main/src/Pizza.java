public class Pizza {

    private String number;
    private String description;
    private float price;

    public Pizza(String number, String description, float price) {
        this.number = number;
        this.description = description;
        this.price = price;
    }
    public String toString(){
        return number + " " + description + " " + price;
    }
}

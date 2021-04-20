public class Pizza {

    private int number;
    private String description;
    private float price;

    public Pizza(int number, String description, float price) {
        this.number = number;
        this.description = description;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public String toString(){
        return number + " " + description + " " + price;
    }
}

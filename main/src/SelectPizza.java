import java.util.Scanner;

public class SelectPizza implements View {

    @Override
    public void print() {
        System.out.println("Please select pizza (enter q to quit):");
        System.out.println("0. pizza 0");
        System.out.println("1. pizza 1");
    }

    @Override
    public void handleInput() {
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "0":
                System.out.println("you selected pizza 0");
                break;
            case "1":
                System.out.println("you selected pizza 1");
                break;
            case "q":
                System.out.println("Bye...");
                System.exit(0);
        }

    }
}

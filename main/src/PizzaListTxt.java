import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PizzaListTxt {
   public static void main (String[]args) throws FileNotFoundException {
      PrintStream PizzaList = new PrintStream(new File("List of pizza.txt"));
      PizzaList.println ("Hellow world");

   }


}

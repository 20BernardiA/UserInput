
import java.util.*;
public class TestScanner {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Please type your favorite number: ");
        while (!consoleInput.hasNextInt()) {
         System.out.print("Bruh pick a number");
         consoleInput.nextLine();
        }
           int favNumber = consoleInput.nextInt();
           System.out.print(favNumber);
        }
}

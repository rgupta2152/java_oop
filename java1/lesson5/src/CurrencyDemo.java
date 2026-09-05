import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;


public class CurrencyDemo {
    public static void main(String[] args) {
        int items; // declare items var
        double itemCost, total; // declare additional floating point vars

        // Create the scanner object "input"
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        items = input.nextInt(); // Capture the int value from the user input for total item count
        System.out.print("Enter the cost per item: ");
        itemCost = input.nextDouble(); // Capture the double value from the user input for cost
        total = items * itemCost;

        // New line for padding
        System.out.println();

        System.out.println("Unformatted output: " + total);

        // Create the NumberFormat object and store it in the variable currencyFormat
            // the "getCurrencyInstance" method returns a NumberFormat object
            // essentially, currencyFormat is of type NumberFormat
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        // Take the NumberFormat object stored in currencyFormat and ask it to format the value stored in total
        System.out.println("Formatted output: " + currencyFormat.format(total));
    }
}

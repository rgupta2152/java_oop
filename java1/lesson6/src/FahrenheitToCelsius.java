import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        // Create immutable vars for the upper and lower bounds of temp for going outside
        final int min_park_temp = 70;
        final int max_park_temp = 90;

        // Create the scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fahrenheit value: ");
        // Grab the int value from the user input
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        // Grab the string day value from the user input
        String day = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);

        // Initialize a "raining" var as false
        boolean raining = false;
        System.out.print("Is it raining? (y/n): ");
        // Grab the input from the user and convert to lowercase for uniformity
        String rainInput = input.next().toLowerCase();
        if (rainInput.startsWith("y")) {
            raining = true;
        }

        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.printf("%s %.1f \n", day + " Celsius: ", celsius);
        if ((fahrenheit >= min_park_temp) && (fahrenheit <= max_park_temp) && (!raining)) {
            System.out.println("Go to the park");
        }
        else {
            System.out.println("Stay home");
        }
    }
}

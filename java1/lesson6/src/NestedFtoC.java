import java.util.Scanner;

public class NestedFtoC {
    public static void main(String[] args) {
        final int min_park_temp = 70;
        final int max_park_temp = 90;

        // Create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        input.nextLine();
        System.out.print("Enter a day of the week: ");
        String day = input.nextLine();
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Check for rain; start with initialized rain var
        boolean raining = false;
        System.out.print("Is it raining? (y/n): ");
        String rainInput = input.next().toLowerCase();
        if (rainInput.startsWith("y")) {
            raining = true;
        }

        // Start by relaying temp back to user
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.printf("%s %.1f \n", day + " Celsius: ", celsius);

        if ((fahrenheit > min_park_temp) && (fahrenheit < max_park_temp)) {
            System.out.print("Yay! The temperature is nice. ");

            if (raining) {
                System.out.println("Find something fun to do in the rain.");
            } else {
                System.out.println("It's not raining and the temp is nice, go outside!");
            }
        }
        else {
            System.out.print("The weather sucks, stay inside and study.");
        }
    }
}

import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        // Create scanner object "input"
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");

        // Get int input value for fahrenheit
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        // next() returns the input token as a string value
        String day = input.next();

        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celsius: " + celsius);
    }
}

import java.util.Scanner;

public class FtoC_personal {

    public static void main(String[] args){

        final int min_park_temp = 70;
        final int max_park_temp = 95;

        // Create the scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);

        // Init raining flag
        boolean raining = false;
        System.out.print("Is it raining? (y/n): ");
        String rainInput = input.next().toLowerCase(); // Remember to assign user input to var to make usable
        if (rainInput.equals("y")) {
            raining = true;
        }

        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.printf("%s %.1f \n", day + " Celsius: ", celsius);
        if ((fahrenheit >= min_park_temp) && (fahrenheit <= max_park_temp) && !raining){
            System.out.println("Go outside");
        }
        else {
            System.out.println("Stay home");
        }
    }
}

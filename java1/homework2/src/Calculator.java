import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Print list of operations
        System.out.println("List of operations: add subtract multiply divide alphabetize");

        // Create scanner object
        Scanner input = new Scanner(System.in);
        // Ask user to enter operation
        System.out.println("Enter an operation:");
        String operation = input.next().toLowerCase(); // Grab user input for operation

        // Addition
        switch (operation) {
            case ("add"):
                // Prompt user for ints to add
                System.out.println("Enter two integers:");
                // If first int is of the incorrect type, terminate
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                // If not, consume the int
                int add_num1 = input.nextInt(); // Grab first int
                // If second int is of the incorrect type, terminate
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                // If not, consume second int and continue with calculation
                int add_num2 = input.nextInt(); // Grab second int
                int add_output = (add_num1 + add_num2);
                System.out.println("Answer: " + add_output);
                break;

            // Subtraction
            case ("subtract"):
                System.out.println("Enter two integers:");
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }

                int subtract_num1 = input.nextInt(); // Grab first int

                if (!input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }

                int subtract_num2 = input.nextInt(); // Grab second int
                int sub_output = (subtract_num1 - subtract_num2);
                System.out.println("Answer: " + sub_output);
                break;

            // Multiplication
            case ("multiply"):
                System.out.println("Enter two doubles:");

                // If not a double AND not an int, terminate
                if (!input.hasNextDouble() && !input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                    }
                double mult_num1 = input.nextDouble();

                if (!input.hasNextDouble() && !input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }

                double mult_num2 = input.nextDouble();
                double mult_output = (mult_num1 * mult_num2);
                System.out.printf("Answer: %.2f\n", mult_output);
                break;

            // Division
            case("divide"):
                System.out.println("Enter two doubles:");

                if (!input.hasNextDouble() && !input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                double div_num1 = input.nextDouble();

                if (!input.hasNextDouble() && !input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                double div_num2 = input.nextDouble();

                if (div_num2 != 0){
                    double div_output = (div_num1 / div_num2);
                    System.out.printf("Answer: %.2f\n", div_output);
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;

            // Alphabetize
            case("alphabetize"):
                System.out.println("Enter two words:");

                if (!input.hasNextLine()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                String alpha1 = input.next();

                if (!input.hasNextLine()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                String alpha2 = input.next();

                int compareWords = alpha1.toLowerCase().compareTo(alpha2.toLowerCase());

                if (compareWords > 0){
                    System.out.println("Answer: " + alpha2 + " comes before " + alpha1 + " alphabetically.");
                } else if (compareWords < 0) {
                    System.out.println("Answer: " + alpha1 + " comes before " + alpha2 + " alphabetically.");
                } else {
                    System.out.println("Answer: Chicken or Egg.");
                }

                break;

            default:
                System.out.println("Invalid input entered. Terminating...");
        }
    }
}

// Create the class
public class PrimitiveOperations {
    // Build the main method
    public static void main(String[] args) {
        // Start with the two vars
        int var1 = 2;
        double var2 = 5.0;

        // Print each val on their own line
        System.out.println(var1);
        System.out.println(var2);

        // Multiply the two together
        System.out.println(var2 * var1);

        // Cast var1 into a float
        double var3 = var1;
        System.out.println(var3);

        // Cast var2 into an int (which will require explicit casting)
        int var4 = (int) var2;
        System.out.println(var4);

        // Declare a char var
        char var5 = 'A';
        System.out.println(var5);

        // The dec int ascii value of 'A' is 65, and lowercase 'a' is 97
        var5 = (char) (var5 + 32);
        System.out.println(var5);
    }
}

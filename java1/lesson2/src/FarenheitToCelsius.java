/*
"FarenheitToClesius" is the class header, and is a Java identifier
    Java identifiers are used to label classes, methods, variables, etc.
    Can contain letters, digits, _, and $; digit cannot be a starting char
*/

public class FarenheitToCelsius {
 */
    // Start of a "main" method, making FarenheitToCelsius an executable class; main is another identifier
    public static void main (String[] args) {
        // Introduce variables for sat and sun temps
        int saturdayFarenheit;
        int sundayFarenheit;
        saturdayFarenheit = 78;
        sundayFarenheit = 81;
        double saturdayCelsius = (5.0/9) * (saturdayFarenheit - 32);
        double sundayCelsius = (5.0/9) * (sundayFarenheit - 32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday: " + saturdayCelsius);
        System.out.println("Sunday: " + sundayCelsius);
    }
}
// Overloaded version of ArraySearch for string AND int search

public class ArraySearch2 {
    public static void main(String[] args){
        // Create string and number arrays
        String[] words = {"hello", "Rohan", "Gupta", "computers", "success"};
        int[] numbers = {2, 4, 6, 8, 10, 12};

        // Call to array search method for strings
        System.out.println(searchArray("Rohan", words));
        System.out.println(searchArray("no", words));
        System.out.println(searchArray("hello", words));

        // Call to array search method for int
        System.out.println(searchArray(2, numbers));
        System.out.println(searchArray(7, numbers));
        System.out.println(searchArray(8, numbers));
    }

    public static boolean searchArray(String target, String[] array) {
        boolean result = false;
        for (String element : array) {
            if (element != null && element.equals(target)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean searchArray(int target, int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
            }
        }
        return result;
    }
}




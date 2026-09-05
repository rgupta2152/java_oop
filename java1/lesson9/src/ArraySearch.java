public class ArraySearch {
    public static void main(String[] args) {
        // Create the words array
        String[] words = {"hello", "Rohan", "Gupta", "computers", "success"};

        // Call the searchArray method from below; only need to define `result` variable type once
        String result = searchArray("Rohan", words);
        System.out.println(result);

        result = searchArray("failure", words);
        System.out.println(result);

        result = searchArray("hello", words);
        System.out.println(result);
    }

    public static String searchArray(String target, String[] wordArray) {
        String result = "not found"; // initialize the result
        for (String word : wordArray) { // iterate over elements in wordArray
            if (word.equals(target)) { // if element equals target word...
                result = "found"; // ...change result to found
                break; // end search; without it, Java would keep checking the rest of the array even though it already found the target
            }
        }
        return result; // Return the string `result`
    }
}


// Expected Output:
    // found
    // not found
    // found
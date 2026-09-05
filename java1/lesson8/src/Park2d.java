/*
Create a program that traverses a 2d array and prints "Go to the park" for all temperature values that fall between
75 and 90 degrees.

Implement a row-order traversal
*/

public class Park2d {
    public static void main(String[] args) {
        double[][] tempArray = {{73, 75, 96},
                                {98, 89, 67}}; // init and declare array w/ temp values

        // Row traversal means outer loop iterates over rows...
        for (int row = 0; row < tempArray.length; row++){
            // ... inner loop over columns
            for (int col = 0; col < tempArray[row].length; col++){
                if (tempArray[row][col] <= 90 && tempArray[row][col] >= 75){
                    System.out.println("Go to the park.");
                }
            }
        }
    }
}



/*
Expected output: Printed result 2 times
*/
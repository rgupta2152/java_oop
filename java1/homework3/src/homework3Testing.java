import java.util.Arrays;

public class homework3Testing {
    public static void main(String[] args) {
        int[][] array = new int[5][2];
        System.out.println("initial array: " + Arrays.deepToString(array));

    int[] testCoord = {1, 2};
    array[0] = testCoord;
    System.out.println("test array: " + Arrays.deepToString(array));

    int[] testCoord2 = {3, 4};
    array[1] = testCoord2;
    System.out.println("test array: " + Arrays.deepToString(array));


    System.out.println(Arrays.toString(testCoord));

    int row = 0;
        boolean b = testCoord == array[row];
        System.out.println(b);
    int row1 = 1;
        boolean c = testCoord2 == array[row1];
        System.out.println(c);

    System.out.println(array.length);

    for (int[] element : array) {
        System.out.println(Arrays.toString(element));
    }

    String first = "1";
    String second = "2";
    int third = 1;
    System.out.println(first + second + third);

//        for (int row = 0; array.length < 5; row++) {
//        if (testCoord == array[row]) {
//            System.out.println("First element is " + Arrays.toString(testCoord));
//        } else if (array[row] == testCoord2) {
//            System.out.println("First element is " + Arrays.toString(testCoord2));
//        } else {
//            System.out.println("Does not match any of the tests");
//        }
    }
}


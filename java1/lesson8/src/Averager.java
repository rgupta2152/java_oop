// Recreation of a program that, given an array of temperatures for the week, averages them out

/*
Steps:
1. Create the array of week high temps
2. Initialize a counter to sum to the temps
3. Iterate over the array to add to the counter, to then get to the total of high temps across weeks
4. Average that value by the number of elements in the array
*/

public class Averager {
    public static void main(String[] args){
        double[] weekHighs = {80, 70, 90, 95, 97, 88}; // initialize the array with some values
        double highSum = 0;
        for (double weekHigh : weekHighs) {
            highSum = highSum + weekHigh;
        }
        double average = highSum / weekHighs.length;
        System.out.printf("Average Temp Across Weeks: %.2f\n", average);
    }
}

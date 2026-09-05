// Same as averager, but values in array are inputted by user

/*
Current issues:
    - this program trusts user to enter the correct number of days (b/w 1 and 7)
    - Does not account for divide by zero if zero days is inputted
*/

import java.util.Scanner;

public class AveragerInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Initialize scanner
//        double[] dayHighs = new double[7]; // Initialize array
        System.out.println("How many days worth of temperature values from this week do you want to average: ");
        int numDays = input.nextInt();
        double[] dayHighs = new double[numDays];

        System.out.println("Enter " + numDays +  " values of daily temperatures this week: ");
        double daySum = 0; // initialize sum
        for (int i = 0; i < numDays; i++){
            dayHighs[i] = input.nextDouble();
            daySum = daySum + dayHighs[i];
        }

        double average = daySum / numDays;
        System.out.printf("Average for days inputted: %.2f", average);
    }
}



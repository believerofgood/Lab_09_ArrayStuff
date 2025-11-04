
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        // Program 01: Declare an array of type int named dataPoints
        int[] dataPoints = new int[100];

        // Program 02: Initialize each element to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Program 03: Display values separated by "|"
        System.out.println("Data Points:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // move to next line

        // Program 04: Calculate and display sum and average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Program 05: Prompt user to input a value between 1 and 100
        System.out.print("Enter a number between 1 and 100: ");
        int userValue = input.nextInt();

        // Program 06: Count how many times user's value appears
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println(userValue + " appears " + count + " times.");

        // Program 07: Display positions where user's value is found
        System.out.print("Found at positions: ");
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Program 08: Find and display minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int value : dataPoints) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        // Program 09: Test static method that returns average of double array
        double[] testArray = {10.5, 20.0, 30.5};
        double testAverage = getAverage(testArray);
        System.out.println("Average of testArray: " + testAverage);
    }

    // Program 09: Static method to calculate average of double array
    public static double getAverage(double[] values) {
        double sum = 0;
        for (double val : values) {
            sum += val;
        }
        return sum / values.length;
    }
}

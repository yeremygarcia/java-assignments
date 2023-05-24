package Debugging;
public class Main {

    // Write a Java method that calculates the average of an array of integers.
    // This method should take an array of integers as input and return a double as output.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Test your method with an array containing the numbers 1, 2, 3, 4, 5. Your method should return 3.0.
        double average = sumOfArrays(array);
        System.out.println("Average = " + average);
    }

    public static double sumOfArrays(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            sum = sum + number;
        }
        return (double) sum / numbers.length;
    }


}
//To debug I ran the native debugger in intelliJ to find my errors by setting breakpoints on each line of the code where needed
package CollectionsAndErrorHandling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(13);
        numbers.add(14);
        numbers.add(18);
        numbers.add(13);
        numbers.add(4);

        try {
            // Removes duplicates using a Set
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            // Calculates sum
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Calculate the average
            double average = (double) sum / numbers.size();

            // Prints sum, average, and the list of integers without duplicates
            System.out.println("Original List: " + numbers);
            System.out.println("List without Duplicates: " + uniqueNumbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception occurred: " + e.getMessage());
        } finally {

            System.out.println("Program execution completed.");
        }
    }
}

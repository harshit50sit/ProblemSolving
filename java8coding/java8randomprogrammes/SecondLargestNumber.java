package java8coding.java8randomprogrammes;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class SecondLargestNumber {
    public static void main(String ss[]){
        List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 50, 75, 65);

        // Step 1: Find the second largest number in the list
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Step 2: Remove duplicates
                .sorted(Comparator.reverseOrder()) // Step 3: Sort in descending order
                .skip(1) // Step 4: Skip the first (largest) number
                .findFirst(); // Step 5: Get the second largest number

        // Step 6: Display the result
        if (secondLargest.isPresent()) {
            System.out.println("The second largest number is: " + secondLargest.get());
        } else {
            System.out.println("The list does not have enough unique numbers.");
        }


    }
}

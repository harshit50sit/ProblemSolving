package java8coding.java8randomprogrammes;

/*
3. Java 8 Program to Find the Maximum Number and Minimum Number in a List
 */
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinWithStreams {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Finding the maximum number using Stream API
        OptionalInt maxNumber = numbers.stream() // Convert list to stream
                .mapToInt(Integer::intValue) // Convert Integer to int
                .max(); // Find maximum value

        // Finding the minimum number using Stream API
        OptionalInt minNumber = numbers.stream() // Convert list to stream
                .mapToInt(Integer::intValue) // Convert Integer to int
                .min(); // Find minimum value

        // Displaying the maximum and minimum numbers
        maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max));
        minNumber.ifPresent(min -> System.out.println("Minimum Number: " + min));
    }
}

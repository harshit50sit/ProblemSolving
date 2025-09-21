package java8coding.java8randomprogrammes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8 Program to Remove Duplicate Elements from a List
 * Author: https://www.javaguides.net/
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        // Example 1: Integer List
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);

        // Example 2: String List
        List<String> fruits = Arrays.asList("apple", "orange", "apple", "banana");
        List<String> uniqueFruits = fruits.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("Unique fruits: " + uniqueFruits);
    }
}

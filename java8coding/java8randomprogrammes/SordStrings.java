package java8coding.java8randomprogrammes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8 Program to Sort a List of Strings Alphabetically
 * Author: https://www.javaguides.net/
 */
class SortStrings{

    public static void main(String[] args) {
        // Example 1: Sorting a list of strings
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Grapes");

        // Sort the list alphabetically using Java 8 streams
        List<String> sortedFruits = fruits.stream()
                .sorted()  // Sorts in natural order (alphabetically)
                .collect(Collectors.toList());

        // Display the sorted list
        System.out.println("Sorted fruits: " + sortedFruits);

        // Example 2: Sorting another list of strings
        List<String> animals = Arrays.asList("Zebra", "Monkey", "Elephant", "Ant");

        // Sort the list alphabetically using Java 8 streams
        List<String> sortedAnimals = animals.stream()
                .sorted()  // Sorts in natural order (alphabetically)
                .collect(Collectors.toList());

        // Display the sorted list
        System.out.println("Sorted animals: " + sortedAnimals);
    }
}
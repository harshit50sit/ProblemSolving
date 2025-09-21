package java8coding.java8randomprogrammes;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java 8 Program to Reverse Each Word of a String
 * Author: https://www.javaguides.net/
 */
public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Reverse each word using Java 8 streams
        String result = Stream.of(input.split("\\s+"))          // Split the string into words
                .map(word -> new StringBuilder(word).reverse().toString())  // Reverse each word
                .collect(Collectors.joining(" "));  // Join the reversed words back into a string

        // Step 3: Display the result
        System.out.println("Reversed words: " + result);
    }
}

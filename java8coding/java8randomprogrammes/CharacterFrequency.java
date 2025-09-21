package java8coding.java8randomprogrammes;

// Java 8 Program to Find the Frequency of Each Character in a Given String
// Author: https://www.rameshfadatare.com/

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world";

        // Step 1: Convert the string to a stream of characters
        Map<Character, Long> characterFrequency = input.chars()
                .filter(c -> c != ' ') // Optional: Ignore spaces
                .mapToObj(c -> (char) c)
                // Step 2: Group by character and count the frequency
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 3: Display the frequency of each character
        characterFrequency.forEach((character, frequency) ->
                System.out.println("'" + character + "' -> " + frequency));
    }
}

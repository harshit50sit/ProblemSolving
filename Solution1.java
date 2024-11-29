
import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String ss[]) {
        System.out.println("Find Frequency");
        String input = "Harshit Verma @ infosys 12";
        Map<Character, Long> charFrequency = input.chars() // Converts the string to an IntStream of characters
                .mapToObj(c -> (char) c) // Convert int to char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(charFrequency);

        // Print character frequencies
        charFrequency.forEach((character, frequency) ->
                System.out.println("Character: '" + character + "', Frequency: " + frequency)
        );

        // Split the string into words and count frequency using Streams
        Map<String, Long> wordFrequency = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Print the word frequencies
        wordFrequency.forEach((word, frequency) ->
                System.out.println("Word: \"" + word + "\", Frequency: " + frequency)
        );
    }
}


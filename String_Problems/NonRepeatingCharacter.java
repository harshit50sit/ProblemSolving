package String_Problems;
import java.util.*;
/*
Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Note : When you return '$' driver code will output -1.

Examples:

Input:
s = hello
Output: h
Explanation: In the given string, the first character which is non-repeating is h, as it appears first and there is no other 'h' in the string.
Input:
s = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is the character which is non-repeating.
 */
public class NonRepeatingCharacter {
    //Function to find the first non-repeating character in a string.
    static char nonRepeatingCharacter(String S)
    {
        //Your code here
        Map<Character,Integer> charcterCountMap = new LinkedHashMap<>();
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(charcterCountMap.containsKey(ch))
            {
                charcterCountMap.put(ch,charcterCountMap.get(ch)+1);
            }
            else{
                charcterCountMap.put(ch,1);
            }

        }
        for (Map.Entry<Character, Integer> entry : charcterCountMap.entrySet()) {
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }

        }
        return '$';
    }
    public static void main(String[] args) {
        String input = "hello";
        char result = nonRepeatingCharacter(input);

        if (result != '$') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

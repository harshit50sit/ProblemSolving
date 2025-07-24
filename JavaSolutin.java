import java.util.*;
import java.util.stream.Collectors;

public class JavaSolutin {
    public static void main(String[] args) {
        List<String> fruitsName = Arrays.asList("apple","banana","apricot","blueberry","grapes");

        Map<Character,String> gropuedResult = fruitsName.stream()
                .collect(Collectors.groupingBy(word -> word.length() > 1 ? word.charAt(1) : ' ',
                        Collectors.mapping(word -> word, Collectors.joining(", "))));

        gropuedResult.forEach((key,value) -> {
            System.out.println("charcter - "+key+"-"+value);
        });





        }
}

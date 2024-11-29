package Collections;

import java.util.*;

public class CollectionUtilityDemo {
    public static void main(String[] args) {

        // Example List of Cricketers
        List<String> cricketers = Arrays.asList(
                "Sanju Samson", "Suryakumar Yadav", "Abhishek Sharma", "Tilak Varma",
                "Hardik Pandya", "Rinku Singh", "Ramandeep Singh", "Axar Patel",
                "Arshdeep Singh", "Ravi Bishnoi", "Varun Chakaravarthy", "Avesh Khan",
                "Jitesh Sharma", "Vijaykumar Vyshak", "Yash Dayal", "Rishabh Pant"
        );


        // 1. Sorting alphabetically by default (natural ordering)
        Collections.sort(cricketers);
        cricketers.forEach(System.out::println);

        // 2. Custom Sorting by length of name
        Collections.sort(cricketers,Comparator.comparingInt(String::length));
        cricketers.forEach(System.out::println);

        // 3. Sorting in Descending Order
        cricketers.sort(Collections.reverseOrder());
        cricketers.forEach(System.out::println);

        // 4. Binary Search
        Collections.sort(cricketers);
        cricketers.forEach(System.out::println);
        int index = Collections.binarySearch(cricketers,"Yash Dayal");
        System.out.println(index);


        // 5. Reversing the List
        Collections.reverse(cricketers);
        cricketers.forEach(System.out::println);

        // 6. Shuffling the List
        Collections.shuffle(cricketers);
        cricketers.forEach(System.out::println);

        // 7. Swapping elements
        Collections.swap(cricketers,0, cricketers.size()-1);
        cricketers.forEach(System.out::println);

        // 8. Creating an unmodifiable collection
        List<String> unModifiableList = Collections.unmodifiableList(cricketers);
        unModifiableList.forEach(System.out::println);

        // 9. Finding max and min by custom comparator (e.g., longest and shortest names)
        String longestName = Collections.max(cricketers, Comparator.comparingInt(String::length));
        String shortestName = Collections.min(cricketers, Comparator.comparingInt(String::length));
        System.out.println(longestName);
        System.out.println(shortestName);

        // 10. Frequency of an element
        int frequency = Collections.frequency(cricketers, "Sanju Samson");
        System.out.println(frequency);

        // 11. Disjoint: Check if two lists have no elements in common
        List<String> newCricketers = Arrays.asList("Rishabh Pant", "Shubman Gill");
        boolean noCommonElements = Collections.disjoint(cricketers, newCricketers);
        System.out.println(noCommonElements);

        // 12. Copying contents from one list to another
        List<String> copyCricketers = new ArrayList<>(Collections.nCopies(cricketers.size(),""));
        Collections.copy(copyCricketers,cricketers);
        copyCricketers.forEach(System.out::println);

        // 13. Replacing all elements with a single value
            Collections.fill(cricketers,"Test Fill Method");
        cricketers.forEach(System.out::println);

        // 14. Synchronized Collection
        Collection<String> synchronizedCollection = Collections.synchronizedCollection(
                new ArrayList<>(cricketers)
        );
        synchronizedCollection.forEach(System.out::println);

    }
}

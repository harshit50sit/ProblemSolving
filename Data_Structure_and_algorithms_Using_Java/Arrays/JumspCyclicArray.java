package Data_Structure_and_algorithms_Using_Java.Arrays;
/*
    Given an array which contains number less than the length of the array, and five one starting index.You need to find the
    number of jumps required to come back to the starting position
    Example: arr = {1, 2, 0}
    starting Index = 0
    output = 3
    // Explanation: 0 -> 1 -> 2 -> 0, so total 3 jumps are required to come back to the starting position

 */
import java.util.Scanner;
public class JumspCyclicArray {
    public static int findJumps(int arr[], int startIndex){
        int jumps = 0;
        int currentIndex = startIndex;
        boolean visited[] = new boolean[arr.length];
        while(true){
            if(visited[currentIndex]){
               break;
            }
            visited[currentIndex] = true;
            currentIndex = arr[currentIndex];
            jumps++;
        }
        return currentIndex == startIndex ? jumps : -1; // If we return to the starting index, return the number of jumps, else return -1
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the starting index");
        int startIndex = sc.nextInt();
        System.out.println("Number of jumps required to come back to the starting position: " + findJumps(arr, startIndex));
    }
}

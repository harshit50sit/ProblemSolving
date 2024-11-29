package Data_Structure_and_algorithms_Using_Java.Arrays;

import java.util.Scanner;

public class SolutionFul {
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum1 = 0;
        for(int i=0; i<arr.length; i++){
            sum1 = sum1 + arr[i];
            int sum2 = 0;
            for(int j = i; j<arr.length; j++){
                sum2 = sum2 + arr[j];
            }
            if(sum1 == sum2){
                System.out.println("Element--"+arr[i]+"Index -- "+i);
            }
        }
        /* int totalSum = 0;
        for(int value : arr){
            totalSum += value;
        }
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(rightSum == leftSum){
                System.out.println("Element--"+arr[i]+"Index -- "+i);
            }
            leftSum = leftSum + arr[i];
        } */
//
    }
}

package Data_Structure_and_algorithms_Using_Java.Arrays;

import java.util.*;
public class Solution {

    public static int findShortestSubArray(int[] num, int threshold) {
        int sum = 0;
        int minSubArraySize = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            while (sum > threshold) {
                minSubArraySize = Math.min(minSubArraySize, i-j+1);
                sum = sum - num[j];
                j++;
            }
        }
        return (minSubArraySize == Integer.MAX_VALUE) ? -1 : minSubArraySize;
    }

    public static void main(String ss[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int thresHold = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(findShortestSubArray(num, thresHold));
    }
}


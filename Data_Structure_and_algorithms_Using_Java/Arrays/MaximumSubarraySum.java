//Kadane's Algorithm--Maximum subarray sum
//Input-{-2, -3, 4, -1, -2, 1, 5, -3}
//Output--{7}
import java.util.*;
public class MaximumSubarraySum {
    public static int maxSubarraySum(int arr[],int size)
    {
        int maximum = arr[0];
        int curr_max = arr[0];
        for(int i=0 ; i<arr.length; i++)
        {
            curr_max = Math.max(arr[i], curr_max+arr[i]);
            maximum = Math.max(maximum, curr_max);
        }
        return maximum;
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0 ; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = maxSubarraySum(arr,size);
        System.out.println(res);
    }
    
}

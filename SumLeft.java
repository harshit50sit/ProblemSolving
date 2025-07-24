import java.util.*;
public class SumLeft {
    public static int findMiddleElement(int arr[]){
        int totalSum = 0;
        int leftSum = 0;
        for(int num : arr){
            totalSum = totalSum + num;
        }
        for(int i=0; i<arr.length; i++){
            totalSum = totalSum - arr[i];
            if(leftSum == totalSum){
                return arr[i];
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1,8};
        System.out.println(findMiddleElement(arr));

    }
}

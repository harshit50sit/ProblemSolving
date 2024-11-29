package Data_Structure_and_algorithms_Using_Java.Arrays;
/*Given 2 arrays, find the common elements of the given two arrays.
eg: arr1 = [3,6,2,9,10,15,13]
arr2= [6,13,11,15]
output: [6,13,15] */
import java.util.*;
public class CommonValue {
    public List<Integer> findCommonValues(ArrayList<Integer> num1, ArrayList<Integer> num2){
        List<Integer> outputArray = new ArrayList<>();
        for(Integer value : num1){
            if(num2.contains(value)){
                outputArray.add(value);
            }
        }
       return outputArray;
    }

}

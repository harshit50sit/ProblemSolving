//Input--1abc23
//Output--24
import java.util.*;
public class Solution {
    public static int sumOfDigit(String input)
    {
        String temp = "0";
        int sum = 0;
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(Character.isDigit(ch))
            {
                temp += ch;
            }
            else
            {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
           
        }
        return(sum + Integer.parseInt(temp));
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(sumOfDigit(input));

    }
}

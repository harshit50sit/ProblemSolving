//Q-Check if the number is balanced(https://practice.geeksforgeeks.org/problems/check-if-the-number-is-balanced3014/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=1&query=category[]StringsproblemStatusunsolvedpage1category[]Strings#)
//Given an integer N which has odd number of digits, find whether the given number is a balanced or not.
//N = 1234006
//Output-1(Balanced)
//L.H.S=1+2+3=6.R.H.S=0+0+6=6 lhs==rhs(balanced)
package String_Problems;
import java.util.*;
public class NumberBalanced {
    public static boolean isBalanced(String N)
    {
        int length = N.length();
        int mid = length / 2;
        int sum1=0, sum2=0;
        String temp = "0";
        for(int i=0 ; i<mid; i++)
        {
            temp = temp + N.charAt(i);
            sum1 = sum1 + Integer.parseInt(temp);
            temp = "0";
        }
        for(int i=(mid+1) ; i<length; i++)
        {
            temp = temp + N.charAt(i);
            sum2 = sum2 + Integer.parseInt(temp);
            temp = "0";
        }
        if(sum1 == sum2)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        if(isBalanced(N))
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}

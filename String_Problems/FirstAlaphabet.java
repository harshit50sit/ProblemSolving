package String_Problems;
import java.util.*;
public class FirstAlaphabet {
    public static String printFirstLetter(String str)
    {
        String word[] = str.split(" ");
        String res="";
        String res1="";
        for(int i=0; i<word.length; i++)
        {
            String str1 = word[i];
            StringBuilder sb  = new StringBuilder(str1);
            res1 = res1 + sb.reverse().toString() + " ";
            res = res + str1.charAt(0) + " ";
        }
        System.out.println(res1);
        return res;
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(printFirstLetter(str));
    }
}

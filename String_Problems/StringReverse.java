package String_Problems;
import java.util.*;
public class StringReverse {
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Method 1
        String str1[] = str.split("");
        List<String> sentence = new ArrayList<String>();
        sentence = Arrays.asList(str1);
        Collections.reverse(sentence);
        String res="";
        for(String s : sentence)
        {
            res += s;
        }
        System.out.println(res);
        //Method 2
        String rev="";
        for(int i=(str.length())-1 ; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        //Method 3 Using String Builder 
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString()); 

    }
    
}

//Input- Abc Xyz Pqrst
//Output - A. X. Pqrst
package String_Problems;
import java.util.*;
public class InitialsName {
    public static String firstLetter(String name)
    {
        String str[] = name.split(" ");
        String res = "";
        int size = str.length;
        for(int i=0; i<(str.length)-1; i++)
        {
            String s = str[i];
            res = res + s.charAt(0) + "."+ " ";
        }
        res = res + str[size-1].toString();
        return(res);
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(firstLetter(name));
    }
}

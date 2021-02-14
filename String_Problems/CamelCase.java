//Count of camel case characters
//S = "ckjkUUYII"
//Output: 5

package String_Problems;
import java.util.*;
public class CamelCase {
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c=0;
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                c++;
            }
        }
        System.out.println(c);
    }
    
}

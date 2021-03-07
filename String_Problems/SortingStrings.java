/* 
Given a string S consisting of uppercase and lowercase characters.
The task is to sort uppercase and lowercase letters separately such
that if the ith place in the original string had an Uppercase character
then it should not have a lowercase character after being sorted and vice versa.
S = defRTSersUXI
Output: deeIRSfrsTUX
S = srbDKi
Output: birDKs
*/
package String_Problems;
import java.util.*;
public class SortingStrings {
    public static String caseSort(String str)
    {
        int length = str.length();
        char ch[] = str.toCharArray();
        List<Character> v1 = new ArrayList<Character>();
        List<Character> v2 = new ArrayList<Character>();
        for(int i=0 ;i < length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                v1.add(ch[i]);
            }
            else{
                v2.add(ch[i]);
            }
        }
        Collections.sort(v1);
        Collections.sort(v2);
        int i=0,j=0;
        for(int k=0; k<length; k++)
        {
            if(ch[k] >= 'a' && ch[k] <= 'z')
            {
                ch[k] = v1.get(i);
                ++i;
            }
            else
            {
                ch[k] = v2.get(j);
                ++j;
            }
        }
        String res = "";
        for(char c : ch)
        {
            res = res + c;
        }
        System.out.println("Result is:");
        return(res);

    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        System.out.println("Output :"+caseSort(str));
    }
}

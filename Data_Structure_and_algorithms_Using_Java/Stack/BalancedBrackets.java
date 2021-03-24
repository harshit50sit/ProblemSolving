
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class BalancedBrackets {
    public static boolean isValidSymbolPattern(String str)
    {
        Stack<Character> stk = new Stack<Character>();
        if(str == null || str.length() == 0)
        {
            return true;
        }
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ')')
            {
                if(!stk.isEmpty() && stk.peek() == '(')
                    stk.pop();
                else
                    return false;
            }
            else if(ch == ']')
            {
                if(!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }
            else if(ch == '}')
            {
                if(!stk.isEmpty() && stk.peek() == '{')
                    stk.pop();
                else
                    return false;
            }
            else
            {
                stk.push(ch);
            }
            
        }
        return(stk.isEmpty());
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pattern");
        String str = sc.next();
        if(isValidSymbolPattern(str))
            System.out.println(str+" is Balanced");
        else
            System.out.println(str+" is not Balanced");
    }
}

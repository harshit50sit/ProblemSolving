//Implementation of Infix to Postfix
//Input--a+b*(c^d-e)^(f+g*h)-i
//Output-->abcd^e-fgh*+^*+i-
//Input->(A+B/C*(D+E)-F)
//Output->ABC/DE+*+F-
//Input->A*B-(C+D)+E
//Output->AB*CD+-E+
import java.util.*;
class InfixToPostfix
{
    public static int Prec(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                 return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String exp)
    {
        String res = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                res += c;
            }
            else if(c == '(')
            {
                stack.push(c);
            }
            else if(c == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    res += stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                {
                    res += stack.pop();
                }
                stack.push(c);
            }

        }
        while(!stack.isEmpty())
        {
            if(stack.peek() == '(')
            {
                return "Invalid expression";
            }
            res += stack.pop();
        }
        return res;
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        System.out.println(infixToPostfix(exp));
    }
}
//Implementation of Postfix evaluation using stack
//Input-123*+5-
//Output-2
//Input-231*+9-
//Output= -4
import java.util.*;
public class PostfixEvaulation {
    public static int expressionEvaluation(String tokens[])
    {
        /*for(String i : tokens)
        {
            System.out.println(i);
        }*/
        Stack<Integer> s = new Stack<Integer>();
        for(String token : tokens)
        {
            if(token.equals("+"))
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op1 + op2;
                s.push(res);
            }
            else if(token.equals("-"))
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 - op1;
                s.push(res);
            }
            else if(token.equals("*"))
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 * op1;
                s.push(res);
            }
            else if(token.equals("/"))
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 / op1;
                s.push(res);
            }
            else
            {
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a expression");
        String exp = sc.next();
        String tokens[] = exp.split("");
        //System.out.println(tokens.length);
        System.out.println(expressionEvaluation(tokens));
    }
}

/* 
import java.util.*;
public class PostfixEvaulation {
    public static int expressionEvaluation(String exp)
    {
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0 ; i<exp.length(); i++)
        {
            if(exp.charAt(i) == '+')
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op1 + op2;
                s.push(res);
            }
            else if(exp.charAt(i) == '-')
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 - op1;
                s.push(res);
            }
            else if(exp.charAt(i) == '*')
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 * op1;
                s.push(res);
            }
            else if(exp.charAt(i) == '/')
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 / op1;
                s.push(res);
            }
            else
            {
                String res = "";
                res = res + exp.charAt(i);
                s.push(Integer.parseInt(res));
            }
        }
        return s.pop();
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a expression");
        String exp = sc.next();
        //String tokens[] = exp.split("");
        //System.out.println(tokens.length);
        System.out.println(expressionEvaluation(exp));
    }
}

*/
import java.util.*;
class InfixToPostfix
{
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        System.out.println(infixToPostfix(exp));
    }
}

import java.util.*;
public class FixedSizeArrayStack {
    static final int max =100;
    static int top = -1;
    static int stack[] = new int[max];
    public boolean isEmpty()
    {
        return(top<0);
    }
    public static boolean push(int val)
    {
        if(top >= max-1)
        {
            System.out.println("Stack overflow");
            return false;
        }
        else
        {
            top++;
            stack[top] = val;
            return true;
        }
    }
    public static void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return;
        }
        else
        {
            int x;
            x = stack[top];
            top--;
            System.out.println("Popped element is "+x);
            display();
        }
    }
    public static void display()
    {
        if(top<0)
        {
            System.out.println("No elements in the stack");
        }
        else
        {
            for(int i=top; i>=0; i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
    public static int peek()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int x = stack[top];
            return x;
        }
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("Stack Operations");
            System.out.println("1-Push"+"\n"+"2-Pop"+"\n"+"3-Display"+"\n"+"4-Peek"+"\n"+"5-Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: int val = sc.nextInt();
                        push(val);
                        break;
                case 2: pop();
                        break;
                case 3: display();
                         break;
                case 4: System.out.println(peek());
                        break;
                case 5:  System.exit(0);               
            }
        }
    }

}

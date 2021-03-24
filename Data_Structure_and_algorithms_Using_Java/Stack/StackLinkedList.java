//Implementation of stack using linklist
import java.util.*;
public class StackLinkedList {
    StackNode top;
    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data = data;
        }
    }
    public boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        }
        else
            return false;
    }
    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        if(top == null)
        {
            top = newNode;
        }
        else{
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(data+ "Pushed to stack");
    }
    public void pop()
    {
        int popped;
        if(top == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        else{
            popped = top.data;
            top = top.next;
            display();
        }
    }
    public void display()
    {
        StackNode temp;
        temp = top;
        if(temp == null)
        {
            System.out.println("No elements in stack");
        }
        else{
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public int peek()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else
        return top.data;
    }
    public static void main(String ss[])
    {
        StackLinkedList l1 = new StackLinkedList();
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
                        l1.push(val);
                        break;
                case 2: l1.pop();
                        break;
                case 3: l1.display();
                         break;
                case 4: System.out.println(l1.peek());
                        break;
                case 5:  System.exit(0);               
            }
        }
    }
}

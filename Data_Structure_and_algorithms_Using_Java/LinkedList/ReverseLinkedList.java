import java.util.*;
public class ReverseLinkedList {
    //static Node head;
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public void insertData(int data)
    {
        Node new_node = new Node(data);
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = new_node;
    }
    //Node reverse(Node node)
    public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        //return node;
    }
    public void printList()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data+"---->");
            n = n.next;
        }
    }
    public static void main(String ss[])
    {
        ReverseLinkedList l1 = new ReverseLinkedList();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.println("1-Insert a data at end"+"\n"+"2-Reverse a linked list"+"\n"+"3-To print the data"+"\n"+"4-Exit");
            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter data");
                       int d = sc.nextInt();
                       l1.insertData(d);
                       break;
                case 2:System.out.println("Reversed Linked List");
                       //head = l1.reverse(head);
                       l1.reverse();
                       l1.printList();
                       break;
                case 3:l1.printList();
                       break;
                case 4:System.exit(0);
                default:System.out.println("Invalid choice");
            }
        }
    }
}

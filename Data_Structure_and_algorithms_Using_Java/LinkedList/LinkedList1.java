package Data_Structure_and_algorithms_Using_Java.LinkedList;
import java.util.*;
//Insertion at front-void push()
//Insertion at end- void append()
//Insertion after a node- void insertAfter()
public class LinkedList1 {
    Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new Node(new_data);
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
	public void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+"---->");
			n = n.next;
		}
	}
	public static void main(String ss[])
	{
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println("1-Insert a data at beginning"+"\n"+"2-Insert a data at end"+"\n"+"3-To print the data"+"\n"+"4-exit");
			System.out.println("Enter choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter data");
				   int d = sc.nextInt();
				   l.push(d);
				   break;
			case 2:System.out.println("Enter data");
			   	   int data = sc.nextInt();
			       l.append(data);
			      break;
			case 3:l.printList();
				    break;
			case 4:System.exit(0);
			default:System.out.println("Invalid choice");
			}
			
		}
	}

    
}

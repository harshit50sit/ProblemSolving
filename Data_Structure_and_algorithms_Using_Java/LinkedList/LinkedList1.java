
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
    public int listLength()
    {
        Node temp = head;
        int len = 0;
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        return(len);
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
    public void insertAfter(int data,int position)
    {
        Node temp = head;
        Node new_node = new Node(data);
        if(position == 0)
        {
            new_node.data = data;
            new_node.next = head;
            head = new_node;
        }
        for(int i=0; i<position-2; i++)
        {
            temp = temp.next;
        }
        new_node.data = data;
        new_node.next = temp.next;
        temp.next = new_node;
    }
	public static void main(String ss[])
	{
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println("1-Insert a data at beginning"+"\n"+"2-Insert a data at end"+"\n"+"3-To print the data"+"\n"+"4-Size of the list"+"\n"+"5-Insert a data at the specific position");
            System.out.println("6-Deleting the fist node"+"\n"+"7-Deleting the last node"+"\n"+"8-Deleteing an intermediate node"+"\n"+"9-exit");
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
            case 4:System.out.println("length of the list is:->"+l.listLength());
                    break;
            case 5:System.out.println("Enter position and data");
                   int pos = sc.nextInt();
                   int d1 = sc.nextInt();
                   l.insertAfter(d1,pos);
                   break;
			case 9:System.exit(0);
			default:System.out.println("Invalid choice");
			}
			
		}
	}

    
}

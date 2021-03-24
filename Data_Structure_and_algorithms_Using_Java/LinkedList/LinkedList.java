
public class LinkedList {
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
	public void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+"----->");
			n = n.next;
		}
	}
	public static void main(String ss[])
	{
		LinkedList l = new LinkedList();
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		l.head.next = second;
		second.next = third;
		third.next = null;
		l.printList();
		
	}    
}

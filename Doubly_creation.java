import java.util.Scanner;
public class Doubly_creation
{
	//declare a node
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	Node head = null;
	Node tail = null;
	//create linked list
	public void creation()
	{ 
		int data, n;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("enter data");
		data= sc.nextInt();
		Node new_Node = new Node(data);
		if(head==null)
		{
			head= new_Node;   
			tail= new_Node;
		}
		else
		{
			head.prev=new_Node;
			new_Node.next= head;   //30 20 10 
			head=new_Node;
		}
		System.out.println("Do you want to add more. If yes, press:1");
		n=sc.nextInt();
	    }
	    while(n==1);
    }
	public void traverser()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("linked list does not exist");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp= temp.next;
			}
		}		
	}
	public static void main(String args[])
	{
		Doubly_creation ll = new Doubly_creation();
		ll.creation();
		ll.traverser(); 
	}
}
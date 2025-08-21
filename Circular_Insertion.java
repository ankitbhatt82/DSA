import java.util.Scanner;
public class Circular_Insertion
{
	//declare a node
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node tail = null;
	//create linked list
	public void creation()
	{ 
		int data,i,m,n,p;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("enter data");
		data= sc.nextInt();
		Node new_Node = new Node(data);
		if(head==null)
		{
			head= new_Node;   
			tail=new_Node;
			new_Node.next=head;
		}
		else
		{
			System.out.print("Enter 1 to insert the item at begining, 2 to insert the item at the end, 3 to insert the item at specific location:");
			m =sc.nextInt();
			switch(m)
			{
			case 1:
				new_Node.next= head;
				head = new_Node;
				tail.next=head;
			break;
			case 2:
				tail.next=new_Node;
				tail=new_Node;
				new_Node.next=head;
			break;
			case 3:
				System.out.println("enter position of node to be inserted");
				p=sc.nextInt();
				Node temp1 = head;
				for(i=0;i<(p-1);i++)
				{
					temp1=temp1.next;
				}
				new_Node.next=temp1.next;
				temp1.next=new_Node;
			break;	
			}
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
		else{
			do{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			while(temp!=head);
		}			
	}
	public static void main(String args[])
	{
		Circular_Insertion ll = new Circular_Insertion();
		ll.creation();
		ll.traverser(); 
	}
}
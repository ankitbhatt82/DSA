import java.util.Scanner;
public class Single_Deletion
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
	public void creation()
	{ 
		int data,n;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("enter data");
		data= sc.nextInt();
		Node new_Node = new Node(data);
		if(head==null)
		{
			head= new_Node;   //10
		}
		else
		{
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
				System.out.println(temp.data+" ");
				temp= temp.next;
			}
		}		
	}
	public void delete()
	{ 
		int i,m,n,p;
		Scanner sc = new Scanner(System.in);
		do
		{
		if(head==null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			System.out.println("Enter 1 to delete the item at begining, 2 to delete the item at the end, 3 to delete the item at specific location:");
			m=sc.nextInt();
			switch(m)
			{
			case 1:
				Node temp=head;
				temp=temp.next;
				head=temp;
			break; 
			case 2:
				Node temp1=head;
				Node ptr = temp1.next;
				while(ptr.next!=null)
				{
					temp1=ptr;
					ptr=ptr.next;
				}
				temp1.next=null;
			break;
			case 3:
				System.out.println("enter position of node to be deleted");
				p=sc.nextInt();
				Node temp2 = head;
				Node ptr1=temp2.next;
				for(i=0;i<(p-2);i++)
				{
					temp2=ptr1;
					ptr1=ptr1.next;
				}
				temp2.next=ptr1.next;
			break;	
			}
		}
		System.out.println("Do you want to delete more. If yes, press:1");
		n=sc.nextInt();
	    }
	    while(n==1);
    }
	public static void main(String args[])
	{
		Single_Deletion ll = new Single_Deletion();
		ll.creation();
		ll.traverser();
		ll.delete(); 
		ll.traverser();
	}
}
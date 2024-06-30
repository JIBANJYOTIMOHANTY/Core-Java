import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
public class Cll
{
	static Node start;
	static Node end;
	public static int get()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public static int count()
	{
		if(start==null)
			return 0;
		int c=0;
		Node temp=start;
		do
        {
			c++;
			temp=temp.next;
		}while(temp!=start);
		return c;
	}
	void create()
	{
		System.out.print("Enter number of elements you want to store : ");
		int pos=get();
		Node temp=new Node();
		start=temp;
		System.out.print("Enter the data value : ");
		temp.data=get();
		for(int i=1;i<pos;i++)
		{
			temp.next=new Node();
			temp=temp.next;
			System.out.print("Enter the data value : ");
			temp.data=get();
		}
		end=temp;
		end.next=start;
		System.out.println("Total number of nodes are : "+count());
	}
	void traverse()
	{
		if(start==null)
			System.out.println("No nodes are avaliable");
		else
        {
		    Node temp=start;
		    System.out.print("start -> ");
		    while(temp.next!=start)
		    {
		    	System.out.print(temp.data+" -> ");
		    	temp=temp.next;
		    }
		    System.out.print(temp.data+" -> last");
		}
		System.out.print("\nTotal number of nodes are: "+count());
	}
	void delete()
	{
		if(start==null)
			System.out.println("No nodes are avaliable");
		else if(start==end)
		{
			start=null;
			end=null;
		}
        else
        {
			System.out.print("Enter the node number you want to delete : ");
			int pos=get();
			if(pos>count())
				System.out.println("Invalid option");
			else
            {
			    Node temp=start;
			    if(pos==1)
			    {
			    	start=start.next;
			    	temp.next=null;
			    	end.next=start;
			    	System.out.println("\nNodes are deleted");
			    }	
			    else if(pos==count())
			    {
			    	for(int i=1;i<(pos-1);i++)
			    	{
			    		temp=temp.next;
			        }
			    	Node temp1=temp.next;
			    	temp.next=start;
			    	temp1=null;
			    	System.out.println("\nNodes are deleted");
			    }
                else
                {
			    	for(int i=1;i<(pos-1);i++)
			    		temp=temp.next;
			    	Node temp1=temp.next;
			    	temp.next=temp1.next;
			    	temp1.next=null;
			    	System.out.println("\nNodes are deleted");
			    }
			}
		}
		System.out.println("number of nodes are : "+count());
	}
	void insert()
	{
		if(start==null)
		{
			System.out.println("No nodes are avaliable");
		}
        else
        {
			System.out.print("Enter the position you want to insert : ");
			int pos=get();
			if(pos>(count()+1) && pos<1)
				System.out.println("Invalid option");
			else
            {
			    Node temp=start;
			    if(pos==1)
			    {
			    	Node in=new Node();
			    	in.data=get();
			    	in.next=start;
			    	start=in;
			    	end.next=in;
			    }
			    else if(pos==(count()+1))
			    {
			    	end.next=new Node();
			    	end=end.next;
			    	end.next=start;
			    	System.out.print("Enter the data value : ");
			    	end.data=get();
			    }
                else
                {
			        for(int i=1;i<(pos-1);i++)
			        	temp=temp.next;
			        Node temp1=temp.next;
			        temp.next=new Node();
			        temp=temp.next;
			        System.out.print("Enter the data value : ");
			        temp.data=get();
			        temp.next=temp1;
			    }
			}
		}
		System.out.println("Number of nodes are present : "+count());
	}

	public static void main(String args[])
	{
		Cll dl=new Cll();
		while(true)
		{
			System.out.println("\n\n\n\t\tDOUBLE LINK LIST APPLICATION\n\t\t************");
			System.out.println("\t\t  Chose your option\n\t\t  ******");
			System.out.println("\n\t\t1)Create Nodes\n\t\t2)Traverse Node\n\t\t3)Insert Nodes\n\t\t4)Delete Nodes\n\t\t5)Quit");
			System.out.print("\n\tPlease yenter your choice : ");
			int ch=get();
			switch(ch)
			{
				case 1:
					dl.create();
					break;
				case 2:
					dl.traverse();
					break;
				case 3:
					dl.insert();
					break;
				case 4:
					dl.delete();
					break;
				case 5:
					System.out.println("Thank you for using my application");
					System.exit(0);
				default:
					System.out.println("Invalid option");
					break;
			}
		}
	}
}
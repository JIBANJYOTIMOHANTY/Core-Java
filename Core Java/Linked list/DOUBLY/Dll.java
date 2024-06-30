import java.util.Scanner;
class Node
{
    Node prev;
    int data;
    Node next;
}
public class Dll
{
	public static Node start;
	public static Node end;
	public static int get()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public static int count()
	{
		int count=1;
		if(start==null)
		{
			System.out.println("No node is available");
        }
        else
        {
			Node temp=start;
			while(temp.next!=null)
			{
				count++;
				temp=temp.next;
			}
		}
		return count;
	}
	void create()
	{
		System.out.println("Enter the number of nodes you want to create : ");
		int no=get();
		if(no>0)
		{
			Node temp=new Node();
			start=temp;
			System.out.print("Enter the data value : ");
			temp.data=get();
			for(int i=1;i<no;i++)
			{
				temp.next=new Node();
				temp.next.prev=temp;
				temp=temp.next;
				System.out.print("Enter the data value : ");
				temp.data=get();
			}
			end=temp;
		}
		System.out.println("Total number of nodes are : "+count());
	}

	void traverse()
	{
		if(start==null)
		{
			System.out.println("No node is available");
        }
        else
        {
			Node temp=start;
			System.out.print("Start -> ");
			while(temp!=null)
			{
				System.out.print(temp.data+"-> ");
				temp=temp.next;
			}
			System.out.print(" Last");
		}
		System.out.println("Total number of nodes are : "+count());
	}

	void delete()
	{
		if(start==null)
		{
			System.out.println("No node is available");
		}
		else if(start.next==null)
		{
			start=null;
			end=null;
		}
        else
        {
			System.out.print("Enter the node/position you want to delete : ");
			int pos=get();
			if(pos==1)
			{
				Node temp=start;
				start=start.next;
				start.prev=null;
				temp.next=null;
			}
			else if(pos==count())
			{
				end=end.prev;
				end.next=null;
			}
            else
            {
				Node temp=start;
				Node temp2=null;
				for(int i=1;i<(pos-1);i++)
				{
					temp=temp.next;
				}
				temp2=temp.next;
				temp.next=temp2.next;
				temp2.prev=null;
				temp2.next.prev=temp.next;
				temp2.next=null;
			}
		}
		System.out.println("Node deleted");
		System.out.println("Total number of nodes are : "+count());
	}

	void insert()
	{
		if(start==null)
		{
			System.out.println("No node are available");
		}
        else
        {
			System.out.print("\nEnter the position where you want to insert : ");
			int pos=get();
			System.out.print("\nEnter the number of element you want to insert : ");
			int no=get();
			//Node temp=start;
			for(int i=1;i<=no;i++)
			{
				Node temp=start;
				if(pos==1)
				{
					start=new Node();
					start.next=temp;
					temp.prev=start;
					System.out.println("Enter the data value : ");
					start.data=get();
				}
				else if(pos==(count()+1))
			    {
					Node mu=new Node();
					System.out.println("Enter the data value : ");
					mu.data=get();
					end.next=mu;
					mu.prev=end;
					end=mu;
				}
                else
                {
					for(int k=1;k<(pos-1);k++)
                    {
						temp=temp.next;
                    }

					Node temp1=new Node();
					System.out.println("Enter the data value : ");
					temp1.data=get();
					temp1.next=temp.next;
					temp1.prev=temp;
					temp.next.prev=temp1;
					temp.next=temp1;
				}
				pos++;
			}
			System.out.println("Total number of nodes are : "+count());
		}
	}

	public static void main(String args[])
	{
		Dll dl=new Dll();
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
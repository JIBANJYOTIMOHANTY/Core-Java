import java.util.Scanner;

class Node
{
    Node prev;
    Node next;
    int data;
}
public class Double 
{
    public static Node start;
    public static Node end;
    static int get()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int count()
    {
        if(start == null)
        {
            return 0;
        }
        Node temp = start;
        int count = 1;
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        temp = null;
        return count;
    }

    void create()
    {
        System.out.println("Enter the number of nodes : ");
        int n = get();
        if(n > 0)
        {
            Node temp = new Node();
            start = temp;
            System.out.print("Enter the data : ");
            temp.data = get();
            for(int i = 1; i < n; i++)
            {
                temp.next = new Node();
                temp.next.prev = temp;
                temp = temp.next;
                System.out.println("Enter the data : ");
                temp.data = get();
            }
            end = temp;
        }
        System.out.println("Total number of nodes are : " + count());
    }

    void traverse()
    {
        if(start == null)
        {
            System.out.println("No nodes are available");
        }
        else
        {
            Node temp;
            temp = start;
            System.out.print("start --> ");
            while(true)
            {
                System.out.print(temp.data + " --> ");
                if(temp.next == null)
                {
                    break;
                }
                temp = temp.next;
            }
            System.out.print(" end");
        }
        System.out.println("\nTotal nodes are : " + count());
    }

    void insert()
    {
        if(start == null)
        {
            System.out.println("No nodes are available.");
        }
        else
        {
            System.out.println("Enter the position of the element that you want to insert : ");
            int pos = get();
            if((pos < 1) && (pos > (count() + 1)))
            {
                System.out.println("Invalid position");
            }
            else if(pos == 1)
            {
                Node temp = new Node();
                System.out.println("Enter the data : ");
                temp.data = get();
                start.prev = temp;
                temp.next = start;
                start = temp;                
            }
            else if(pos == (count() + 1))
            {
                Node temp = new Node();
                System.out.println("Enter the data : ");
                temp.data = get();
                end.next = temp;
                temp.prev = end;
                end = temp;
            }
            else
            {
                Node temp = start;
                for(int i = 1; i < (pos - 1); i++)
                {
                    temp = temp.next;
                }
                Node temp1 = new Node();
                System.out.println("Enter the data : ");
                temp1.data = get();
                temp1.next = temp.next;
                temp1.prev = temp;
                temp.next.prev = temp1;
                temp.next = temp1;
            }
        }
    }

    void delete()
    {
        if(start == null)
        {
            System.out.println("No nodes are available.");
        }
        else if(start.next == null)
        {
            start = null;
            end = null;
        }
        else
        {
            System.out.println("Enter the position of the element that you want to delete : ");
            int pos = get();

            if(pos == 1)
            {
                Node temp = start;
                start = start.next;
                start.prev = null;
                temp.next = null;
            }
            else if((pos < 1) || (pos > count()))
            {
                System.out.println("Invalid position.");
            }
            else if(pos == count())
            {
                end = end.prev;
                end.next = null;
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
    }
    public static void main(String[] args) 
    {
        Double dd = new Double();
        while(true)
        {
            System.out.println("\n_____Welcome To My Single Linked List Application_____\n");
            System.out.println("1 --> Create node");
            System.out.println("2 --> Traverse node");
            System.out.println("3 --> Insert element");
            System.out.println("4 --> Delete element");
            System.out.println("5 --> Quit");

            System.out.print("Please enter your choice : ");
            int choice = get();

            switch(choice)
            {
                case 1:
                    dd.create();
                    break;
                case 2:
                    dd.traverse();
                    break;
                case 3:
                    dd.insert();
                    break;
                case 4:
                    dd.delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }   
}
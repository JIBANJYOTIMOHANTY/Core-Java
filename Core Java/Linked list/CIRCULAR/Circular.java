import java.util.Scanner;

class Node
{
    int data;
    Node next;
}
public class Circular 
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
        if(start==null)
			return 0;
		int count=0;
		Node temp=start;
		do
        {
			count++;
			temp=temp.next;
		}while(temp!=start);
		return count;
    }

    void create()
    {
        System.out.print("Enter the number of nodes : ");
        int n = get();

        if(n > 0)
        {
            Node temp = new Node();
            start = temp;
            for(int i = 1; i <= n; i++)
            {
                System.out.println("Enter the data : ");
                temp.data = get();
                if(i == ((n * 2) / 2))
                {
                    break;
                }
                temp.next = new Node();
                temp = temp.next;
            }
            end = temp ;
            end.next = start;
        }

        System.out.println("Total nodes : " + count());
    }

    void traverse()
    {
        if(start == null)
        {
            System.out.println("No nodes are available.");
        }
        else
        {
            Node temp = start;
            System.out.print("start -->");
            for(int i = 1; i <= count(); i++)
            {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.print("start");
        }
    }
    void insert()
    {
        if(start == null)
        {
            System.out.println("No nodes are available.");
        }
        else
        {
            System.out.println("\nEnter the position of the element that you want to insert : ");
            int pos = get();
            if((pos < 1) || (pos > (count() + 1)))
            {
                System.out.println("Invalid position");
            }
            else
            {
                if(pos == 1)
                {
                    Node temp = start;
                    Node temp2 = new Node();
                    System.out.print("Enter the data : ");
                    temp2.data = get();
                    temp2.next = start;
                    start = temp2;
                    end.next = temp2; 
                    System.out.println("Insertion successfully.");
                }
                else if(pos ==  (count() + 1))
                {
                    Node temp2 = new Node();
                    System.out.print("Enter the data : ");
                    temp2.data = get();
                    end.next = temp2;
                    end = temp2;
                    end.next = start;
                    System.out.println("Insertion successfully.");
                }
                else
                {
                    Node temp = start;
                    for(int i=1;i<(pos-1);i++)
                    {

                        temp=temp.next;
                    }
			        Node temp1=temp.next;
                    Node temp2 = new Node();
			        temp.next=temp2;
			        temp=temp.next;
			        System.out.print("Enter the data value : ");
			        temp.data=get();
			        temp.next=temp1;
                    System.out.println("Insertion successfully.");
                }
            }
        }
    }

    void delete()
    {
        if(start == null)
        {
            System.out.println("\nNo nodes are available.");
        }
        else
        {
            System.out.println("\nEnter the position of the element that you want to delete : ");
            int pos = get();
            if((pos < 1) || (pos > count()))
            {
                System.out.println("\nInvalid position.");
            }
            else
            {
                if(pos == 1)
                {
                    start = start.next;
                    end.next = start;
                }
                else if(pos == count())
                {
                    Node temp = start;
                    for(int i = 1; i < (pos - 1) ; i++)
                    {
                        temp = temp.next;
                    }
                    temp.next = start;
                    end = temp;
                }
                else
                {
                    Node temp = start;
                    for(int i = 1; i < (pos - 1); i++)
                    {
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Circular cc = new Circular();    
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
                    cc.create();
                    break;
                case 2:
                    cc.traverse();
                    break;
                case 3:
                    cc.insert();
                    break;
                case 4:
                    cc.delete();
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
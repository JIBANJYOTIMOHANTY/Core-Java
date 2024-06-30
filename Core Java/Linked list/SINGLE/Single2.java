import java.util.Scanner;

class Node
{
    int data;
    Node next;
}
public class Single2
{
    static Node start;
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
        int count = 1;
        Node temp = start;
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
        System.out.print("Enter the number of nodes : ");
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
                temp = temp.next;
                System.out.print("Enter the data : ");
                temp.data = get();
            }
            temp = null;
        }
        System.out.println("Total number of nodes : " + count());
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
            System.out.print("Data are : ");
            int a = 0;
            while(a != count())
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
                a++;
            }
            temp= null;
        }
        System.out.println("\nTotal nodes are : " + count());
    }

    void insert()
    {
        if(start == null)
        {
            System.out.println("\nNo nodes are available.");
        }
        else
        {
            System.out.print("\nEnter the position of the element that you want to insert : ");
            int pos = get();
            if(pos == 1)
            {
                Node temp = new Node();
                System.out.print("Enter the data : ");
                temp.data = get();
                temp.next = start;
                start = temp;
                System.out.println("Insetion successfully");
            }
            else if(pos == count() + 1)
            {
                Node temp = start;
                for(int i = 1; i < count(); i++)
                {
                    temp = temp.next;
                }
                Node temp1 = new Node();
                System.out.print("Enter the data : ");
                temp1.data = get();
                temp.next = temp1;
                System.out.println("Insetion successfully");
            }
            else if((pos < 1) || (pos > (count() + 1)))
            {
                System.out.println("Invalid position");
            }
            else
            {
                Node temp = start;
                for(int i = 1; i < pos - 1; i++)
                {
                    temp = temp.next;
                }
                Node temp1 = new Node();
                System.out.println("Enter the data : ");
                temp1.data = get();
                temp1.next = temp.next;
                temp.next = temp1;
                System.out.println("Insetion successfully");
            }
        }
    }
    void delete()
    {
        if(start == null)
        {
            System.out.println("\nNo nodes are available");
        }
        else
        {
            System.out.println("\nEnter the position that you want to delete : ");
            int pos = get();
            if(pos == 1)
            {
                Node temp = start;
                start = temp.next;
                System.out.println("Deletion successfully");
            }
            else if(pos == count())
            {
                Node temp = start;
                for(int i = 1; i < pos - 1; i++)
                {
                    temp = temp.next;
                }
                temp.next = null;
                System.out.println("Deletion successfully");
            }
            else if((pos < 1) || (pos > count()))
            {
                System.out.println("Invalid position.");
            }
            else
            {
                Node temp = start;
                for(int i = 1; i < (pos - 1); i++)
                {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                System.out.println("Deletion successfully");
            }
        }
    }
    public static void main(String[] args) 
    {
        Single2 ss = new Single2();
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
                    ss.create();
                    break;
                case 2:
                    ss.traverse();
                    break;
                case 3:
                    ss.insert();
                    break;
                case 4:
                    ss.delete();
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
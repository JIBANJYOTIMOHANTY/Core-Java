import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class Single 
{
    static Node starter;
    static int get()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int count()
    {
        if(starter == null)
        {
            return 0;
        }
        int count = 1;
        Node temp;
        temp = starter;
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
            starter = temp;
            System.out.println("Enter the data : ");
            temp.data = get();
            for(int i = 1; i < n; i++)
            {
                temp.next = new Node();
                temp = temp.next;
                System.out.println("Enter the data : ");
                temp.data = get();
            }
            temp = null;
            System.out.println("Total number of nodes : " + count());
        }
    }

    void traverse()
    {
        if(starter == null)
        {
            System.out.println("No nodes are available.");
        }
        else
        {
            Node temp = starter;
            System.out.println("\033c");
            System.out.print("Data are  : ");
            while(true)
            {
                System.out.print(temp.data + " ");
                if(temp.next == null)
                {
                    break;
                }
                temp = temp.next;
            }
            temp = null;
            System.out.println("\nTotal nodes are : "+ count());
        }
    }

    void insert()
    {
        if(starter == null)
        {
            System.out.println("No nodes are available.");
        }
        else
        {
            System.out.println("Enter the position of the element that you want to insert : ");
            int pos = get();
            Node temp;
            temp = starter;
            if((pos > 1) && (pos <= count() + 1))
            {
                for(int i = 1; i < (pos - 1); i++)
                {
                    temp = temp.next;
                }
                Node temp1 = temp.next;
                Node new1 = new Node();
                System.out.println("Enter the data : ");
                new1.data = get();
                new1.next = temp1;
                temp.next = new1;
            }
            else if(pos == 1)
            {
                Node new2 = new Node();
                System.out.println("Enter the data : ");
                new2.data = get();
                new2.next = starter;
                starter = new2;
            }
            else
            {
                System.out.println("!!!!!!!.....Invalid position.....!!!!!!!");
            }
        }
    }

    void deleteLast()
    {
        if(starter == null)
        {
            System.out.println("No nodes are available.");
        }
        else
        {
            if(count() == 1)
            {
                starter = null;
            }
            else
            {

                Node temp;
                temp = starter;
                for(int i = 1; i < (count() - 1); i++)
                {
                    temp = temp.next;
                }
                temp.next = null;
            }
            System.out.println("...............Deletion Successfully...............");
        }
    }

	void delete() 
	{
		if(starter == null)	
		{
			System.out.println("No node is created.") ;
			} 
			else
			{
				System.out.println("Press 1> for deleting the first node.")	;
				System.out.println("Press 2> for deleting the last node.");
				System.out.println("Press 3> for deleting any position.");
				System.out.println("Enter the node position whom u delete.");
				int pos = get() ;
				if(pos == 1) 
				{
					Node temp;
					temp = starter;
					starter = temp.next;
					// temp = starter;
				}
				else if(pos==2) 
				{
					deleteLast();
				}
				else if(pos==3) 
				{
					System.out.println("Enter the position whom u delete.");
					int no = get();
					if(no > count()) 
					{
						System.out.println("!!!!!no Node is avaialable.!!!!");
					}
					
					else
					{
						if(no == 1) 
						{
							Node temp;
							temp = starter;
							starter = temp.next;
							temp = starter;
						}
						else
						{
							Node temp = starter;
							Node temp2 = null;
							for(int i = 1; i <= count(); i++)
							{
								if(i == no)
								{
									temp2.next = temp.next;
									temp = null;
									break;
								}
								temp2 = temp;
								temp = temp.next;
							}
						}
						System.out.println("Node is deleted.")	;
					}
				}
				else
				{
					System.out.println("!!!!!Invalid Choice.!!!!");
				}
			}

			System.out.println("Total nodes are : "+count())	;
		}
	
    public static void main(String[] args) 
    {
        Single ss = new Single();
		while (true) 
		{
			System.out.println("\t\t\tSingleLinkedList Application.!!!!");
			System.out.println("\t\t\tCheck The Option.");
			System.out.println("\t\t\t1>Create Node");
			System.out.println("\t\t\t2>Traverse Node");
			System.out.println("\t\t\t3>Insert Node");
			System.out.println("\t\t\t4>Delete Last Node");
			System.out.println("\t\t\t4>Delete any Node");
			System.out.println("\t\t\t5>Quit");
			System.out.println("Enter your choice");
			int ch;
			ch = get();
			switch (ch) 
			{
				case 1:
					ss.create();
                    System.out.println("\033c");
					break;
				case 2:
					ss.traverse();
					break;
				case 3:
					ss.insert();
                    System.out.println("\033c");
					break;
				case 4:
					ss.deleteLast();
                    System.out.println("\033c");
					break;
				case 5:
					ss.delete();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice....");
					break;
			}
		}
    } 
}
//step - 1
public class Test1 implements Cloneable
{
    int data;
    Test1(int data)
    {
        this.data = data;
    }
    public static void main(String[] args) 
    {
        // step - 2
        Test1 t1 = new Test1(100)   ;
        System.out.println("Data value is : " + t1.data);

        try
        {
            // step - 3
            Test1 t2 = (Test1) t1.clone();
            System.out.println("Data value is : " + t2.data);
            System.out.println(t1.hashCode() + "\t" + t2.hashCode());
            if(t1.equals(t2))
            {
                System.out.println("Same object");
            }
            else
            {
                System.out.println("Different object");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
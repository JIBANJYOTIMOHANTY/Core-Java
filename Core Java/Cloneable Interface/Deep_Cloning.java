class Address implements Cloneable
{
    int BlNo = 100;
    String area = "CTC";
    String state = "Odisha";
    int pin = 753010;
    @Override
    public String toString()
    {
        return "Building no : " + BlNo + "\nArea : " + area + "\nState : " + state + "\nPin no : " + pin ;
    }
    @Override
    public Address clone() throws CloneNotSupportedException
    {
        return (Address)super.clone();
    }
}
public class Deep_Cloning implements Cloneable
{
    String name = "Jiban";
    int roll = 101;
    String course = "Java";
    double fee = 7000.00;
    Address a1 = new Address();

    @Override
    public Deep_Cloning clone()  throws CloneNotSupportedException
    {
        Deep_Cloning d1 = (Deep_Cloning)super.clone();
        d1.a1 = this.a1.clone();
        return d1;
    }
    public static void main(String[] args) 
    {
        Deep_Cloning d2 = new Deep_Cloning();
        try
        {
            Deep_Cloning d3 = d2.clone();
            if(d2 == d3)
            {
                System.out.println("Object is not cloned.");
            }
            else
            {
                System.out.println("Object is cloned.");
            }

            if(d2.a1 == d3.a1)
            {
                System.out.println("Shallow Cloning");
            }
            else
            {
                System.out.println("Deep Cloning");
            }
            System.out.println("For original object : \n" + d2.name + "\n" + d2.roll + "\n" + d2.course + "\n" + d2.fee);
            System.out.println("For duplicate object : \n" + d3.name + "\n" + d3.roll + "\n" + d3.course + "\n" + d3.fee);
            System.out.println(d2.a1);
            System.out.println(d3.a1);
            if(d2.a1.clone() == d3.a1.clone())
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}
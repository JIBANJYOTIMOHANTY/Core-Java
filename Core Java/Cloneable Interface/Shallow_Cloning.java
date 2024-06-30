class Address
{
    int BlNo = 100;
    String area = "Cuttack";
    String state = "Odisha";
    int pin = 753010;
    @Override
    public String toString()
    {
        return "Building no : " + BlNo + "\nArea : " + area + "\nState : " + state + "\nPin : " + pin;
    }
}
public class Shallow_Cloning implements Cloneable
{
    String name = "Rashmi";
    int roll = 100;
    String course = "Java";
    double fee = 7000.00;
    Address a1 = new Address();
    public static void main(String[] args) 
    {
        Shallow_Cloning s1 = new Shallow_Cloning();
        try
        {
            Shallow_Cloning s2 = (Shallow_Cloning) s1.clone(); 
            if(s1 == s2)
            {
                System.out.println("Object is not cloned.");
            }
            else
            {
                System.out.println("Object is cloned.");
            }
            if(s1.a1 == s2.a1)
            {
                System.out.println("Shallow Cloning.");
            }
            else
            {
                System.out.println("Deep Cloning.");
            }
            System.out.println("For original object : \n" + s1.name + "\n" + s1.roll + "\n" + s1.course + "\n" + s1.fee);
            System.out.println("For duplicate object : \n" + s2.name + "\n" + s2.roll + "\n" + s2.course + "\n" + s2.fee);
            System.out.println(s1.a1); 
            System.out.println(s2.a1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}
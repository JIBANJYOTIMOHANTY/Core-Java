class Student implements Cloneable
{
    String name = "Jiban";
    int roll = 1000;
    @Override
    public Student clone() throws CloneNotSupportedException
    {
        return (Student)super.clone();
    }
}
public class B implements Cloneable
{
    String adr = "CTC";
    Student s1 = new Student();
    @Override
    public B clone() throws CloneNotSupportedException
    {
        B b1 = (B)super.clone();
        b1.s1 = this.s1.clone();
        return b1;
    }
    public static void main(String[] args) 
    {
        B b2 = new B();
        try
        {
            B b3 = b2.clone();
            if(b2 == b3)
            {
                System.out.println("Object is not cloned.");
            }
            else
            {
                System.out.println("Object is cloned.");
            }
            if(b2.s1 == b2.s1)
            {
                System.out.println("Shallow cloning");
            }
            else
            {
                System.out.println("Deep cloning.");
            }
            System.out.println("For Original Object : ----------------->");
            System.out.println("Name : " + b2.s1.name + "\nRoll : " + b2.s1.roll + "\nAddress : " + b2.adr);
            System.out.println("For Duplicate Object : ---------------->");
            System.out.println("Name : " + b3.s1.name + "\nRoll : " + b3.s1.roll + "\nAddress : " + b3.adr);
            System.out.println(b2.s1);
            System.out.println(b3.s1);
            System.out.println(b2);
            System.out.println(b3);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}

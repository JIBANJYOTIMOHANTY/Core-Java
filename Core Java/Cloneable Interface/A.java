class Student
{
    String name = "Jiban";
    int roll = 100;
}
public class A implements Cloneable
{
    String adr = "CTC";
    Student s1 = new Student();
    public static void main(String[] args) 
    {
        A a1 = new A();
        try
        {
            A a2 = (A)a1.clone();
            if(a1 == a2)
            {
                System.out.println("Object is not cloned.");
            }
            else
            {
                System.out.println("Object is cloned.");
            }
            if(a1.s1 == a2.s1)
            {
                System.out.println("Shallow Cloning.");
            }
            else
            {
                System.out.println("Deep Cloning.");
            }
            System.out.println("For Original Object : ---------->");
            System.out.println("Name : " + a1.s1.name + "\nRoll : " + a1.s1.roll + "\nAddress : " + a1.adr);
            System.out.println("For Duplicate Object : ---------->");
            System.out.println("Name : " + a2.s1.name + "\nRoll : " + a2.s1.roll + "\nAddress : " + a2.adr);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a1.s1);
            System.out.println(a2.s1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

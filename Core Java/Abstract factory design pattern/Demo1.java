import java.util.*;
interface Area
{
    public void area();
}
class Circle implements Area
{
    @Override
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();
        System.out.println("Radius area is : " + (3.14 * r * r));
    }
}
class Rectangle implements Area
{
    @Override
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breath : ");
        int b = sc.nextInt();
        System.out.println("Rectangle area is : " + (l * b));
    }
}
class Square implements Area
{
    @Override
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.println("Square area is : " + (l * l));
    }
}
class Factory{
    public static void createObject(Area aa)
    {
        aa.area();
    }
    
}
public class Demo1
{
    public static void main(String[] args) 
    {
        String name = args[0];
        if(name.equals("Circle"))
        {
            Factory.createObject(new Circle());
        }
        else if(name.equals("Rectangle"))
        {
            Factory.createObject(new Rectangle());
        }
        else if(name.equals("Square"))
        {
            Factory.createObject(new Square());
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
import java.util.*;
class Emp
{
    String name;
    int id;
    double salary;
    Emp(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Name is : " + name + "\tId is : " + id + "\tSalary is : " + salary;
    }
}
public class ArrayList2 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        al.add(new Emp("Jiban", 101, 1000000.00));
        al.add(new Emp("Vivek", 102, 150000.00));
        al.add(new Emp("Ramesh", 103, 56000.99));
        al.add(new Emp("Ram Kumar", 104, 256980.32));
        System.out.println("See the elements of arraylist object : ");
        for(int i = 0; i < al.size(); i++)
        {
            Emp ee = (Emp)al.get(i);
            System.out.println(ee);

        }
    }
}
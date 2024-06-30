import java.util.*;
import java.io.*;
class Student
{
    private String name;
    private int roll;
    private String adr;
    Student(String name, int roll, String adr)
    {
        this.name = name;
        this.roll = roll;
        this.adr  = adr ;
    }
    @Override
    public String toString()
    {
        return "Name : " + name + "\nRoll : " + roll + "\nAddress : " + adr;
    }
}
public class D_Array
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of students : ");
        int n = sc.nextInt();
        Student arr[] = new Student[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println();
            System.out.println("Enter the details about student : " + (i + 1));
            System.out.println("Enter the student name : ");
            String name = br.readLine();
            System.out.println("Enter the student roll : ");
            int roll = sc.nextInt();
            System.out.println("Enter the student address : ");
            String adr = br.readLine();
            arr[i] = new Student(name, roll, adr);
        }
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Details about student : " + (i+1));
            System.out.println(arr[i].toString());
        }
    }
}
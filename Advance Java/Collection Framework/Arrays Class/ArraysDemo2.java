import java.util.*;
public class ArraysDemo2 {
    public static void main(String[] args) {
        String str[] = {"Rajeev","Vinit","Ayas","Lovely","Rani"};
        System.out.println("\033cSee the array elements.");
        for(String s : str)
        {
            System.out.print(s + " ");
        }
        Arrays.sort(str,new MyComparatorDemo());
        System.out.println("\nSee the Array elements after sorting ");
        for(String ss : str)
        {
            System.out.print(ss + " ");
        }
    }
}
class MyComparatorDemo implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2)
    {
        String s1 =(String) obj1;
        String s2 =(String) obj2;
        return s2.compareTo(s1);
    }
}

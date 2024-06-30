import java.util.*;
public class ArraysDemo1 {
    public static void main(String[] args) {
        int arr[] = {12,76,23,65,45,99,18};
        System.out.println("\033cSee the Array elements : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nAfter sort array element s are : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        int index = Arrays.binarySearch(arr, 76);
        System.out.println("\nIndex poistion of 76 is : " + index);
    }
    
}

public class Longest_prefix
{
    public static void main(String[] args) 
    {
        String arr[] = {"He","Helloooooo","Helel","Hel"}    ;

        String s = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i].indexOf(s) != 0)
            {
                s = s.substring(0, s.length() - 1);
            }
            if(s.isEmpty())
            {
                System.out.println("Invalid");
            }
        }
        
        System.out.println("Result : " + s);
    }
}
public class Shortest_String
{
    public static void main(String[] args) 
    {
        String arr[] = {"This", "is", "the", "java", "program"};
        String s1 = "This";
        String s2 = "java";

        int a = -1;
        int b = -1;
        int ans = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(s1))
            {
                a = i;
            }
            if(arr[i].equals(s2))
            {
                b = i;
            }
            if(a != -1 && b != -1)
            {
                ans = Math.abs(a - b);
            }
        }
        System.out.println(ans);
    }
}
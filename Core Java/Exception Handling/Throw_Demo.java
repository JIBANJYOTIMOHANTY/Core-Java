public class Throw_Demo 
{
    static void call()throws Exception
    {
        throw new Exception();
    }
    static void show() throws Exception
    {

    }
    public static void main(String[] args) 
    {
        int a,b,c,d;
        a = b = c = d = 0;
        try
        {
            call();
            a++;
        }
        catch(Exception ce)
        {
            b++;
        }
        try
        {
            show();
            c++;
        }
        catch(Exception we)
        {
            d++;
        }
        System.out.print(a + "\t" + b + "\t" + c + "\t" + d);
    }    
}

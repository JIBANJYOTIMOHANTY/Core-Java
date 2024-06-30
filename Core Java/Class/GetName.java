public class GetName 
{
    public static void main(String[] args) 
    {
        try
        {
            Class cc = Class.forName("java.lang.String");
            String name = cc.getName();
            System.out.println("Loaded class is : " + name);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }    
}

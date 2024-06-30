public class class1
{
    static void display(Object obj)
    {
        Class cc = obj.getClass();
        System.out.println("Name of the class is : " + cc.getName());
    }
    public static void main(String[] args) 
    {
        try    
        {
            String ss = new String("Java Technocrat.");
            new class1().display(ss);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}

public class NewInstance 
{
    @Deprecated
    public static void main(String[] args) 
    {
        try      
        {
            //Explicitly load the Demo.class in JVM occupied memory space.
            Class cc = Class.forName("Demo");

            //Explicitly create an object of loaded class without new keyword.
            Demo xx = (Demo) cc.newInstance();
            
            xx.setData(100);
            System.out.print("Data value is : " + xx.getData());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class Demo5 
{
    private static Demo5 dd;
    private int data;

    private Demo5()
    {
        System.out.println("Object is created.");
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return data;
    }
    public static Demo5 createObject()
    {
        if(dd == null)
        {
            dd = new Demo5();
        }
        return dd;
    }
    public static void main(String[] args) 
    {

    }
}
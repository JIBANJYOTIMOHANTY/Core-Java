public class SingleDemo 
{
    public static void main(String[] args) 
    {
        Demo5 aa = Demo5.createObject();
        aa.setData(106);
        System.out.println(aa.getData());
        Demo5 bb = Demo5.createObject();
        
        if(aa == bb)
        {
            System.out.println("Singleton class.");
        }
    }
}

public class Demo2 
{
    public static void main(String[] args) 
    {
        Demo2 dd1 = new Demo2();
        Demo2 dd2 = new Demo2();
        
        System.out.println("dd1.hashcode : " + dd1.hashCode() +"\ndd2.hashcode : " + dd2.hashCode());

        if(dd1.equals(dd2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        Demo2 dd3 = dd2;
        System.out.println("dd2.hashcode : " + dd2.hashCode() +"\ndd3.hashcode : " + dd3.hashCode());
        if(dd2.equals(dd3))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }    
}

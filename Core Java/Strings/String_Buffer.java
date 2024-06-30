public class String_Buffer 
{
    public static void main(String[] args) 
    {
        String s = "Java";
        System.out.println("String is : " + s);
        StringBuffer ss = new StringBuffer(s);
        System.out.println("StringBuffer is : " + ss);
        ss.append(" is a good language.");
        System.out.println("After append StringBuffer is : "+ss);
    }    
}

@FunctionalInterface
interface X
{
    Message getMessage(String message);
}
class Message
{
    Message(String s)
    {
        System.out.println("Message is : " + s);
    }
}
public class Constructor_Method_Reference 
{
    public static void main(String[] args) 
    {
        X aa = Message :: new;
        aa.getMessage("This is constructor to method reference")   ;
    }    
}
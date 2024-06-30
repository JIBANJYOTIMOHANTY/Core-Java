abstract class Card
{
    String name;
    public abstract void greeting();
}
class Season extends Card
{
    Season(String name)   
    {
        this.name = name;
    }
    @Override
    public void greeting()
    {
        System.out.println("Hello "+name);
    }
}
public class demo2 
{
    public static void main(String[] args) 
    {
        Card cc = new Season("Jiban");
        cc.greeting();
    }
}

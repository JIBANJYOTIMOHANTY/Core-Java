enum Color
{
    RED,GREEN,BLUE;
}
public class Demo1 
{
    public static void main(String[] args) 
    {
        Color cc = Color.RED;
        switch(cc)
        {
            case RED:
                System.out.println("It is RED");
                break;
            case GREEN:
                System.out.println("It is GREEN.");
                break;
            case BLUE:
                System.out.println("It is BLUE");
                break;
        }
    }
}

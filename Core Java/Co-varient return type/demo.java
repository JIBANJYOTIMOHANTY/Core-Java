class Base 
{
    public Object getName(String name )
    {
        return name;
    }
}
class Child extends Base
{
    @Override
    public String getName(String s)
    {
        return "Hello " + s;
    }
}
public class demo {

    public static void main(String[] args) {
        Child cc = new Child();
        String name = cc.getName("Jiban");
        System.out.println(name);
    }
}
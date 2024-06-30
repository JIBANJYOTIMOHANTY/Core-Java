// package PRACTICE;
public class A2 
{
    public A1 h(A1 e)    
    {
        System.out.println(e.data + e.name + e.pwd);
        return e;
    }
    public static void main(String[] args) {
        new A2().h(new A1());
    }
    
}

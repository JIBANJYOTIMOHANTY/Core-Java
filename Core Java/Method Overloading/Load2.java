public class Load2 {
    void call(String s)
    {
        System.out.println("I am String class.");
    }
    public void call(Object obj)
    {
        System.out.println("I am Object class.");
    }
    public static void main(String[] args) {
        new Load2().call(null);
    }
}

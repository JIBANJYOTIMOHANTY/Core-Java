public class Lambda4 
{
    public static void main(String[] args) 
    {
        Runnable rr = () -> {System.out.println("Thread is running.");};
        Thread tt = new Thread(rr,"java");
        tt.start();
    }    
}

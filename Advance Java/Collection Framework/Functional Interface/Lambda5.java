public class Lambda5 
{
    public static void main(String[] args) 
    {
        Runnable rr = () -> {
            System.out.println("Thread is running.");
            System.out.println("Thread name is : " + Thread.currentThread().getName());
            System.out.println("Thread Id is : " + Thread.currentThread().getId());
            System.out.println("Thread priority is : " + Thread.currentThread().getPriority());
        };
        Thread t1 = new Thread(rr,"Java");
        t1.start();
    }    
}

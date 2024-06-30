public class Demo 
{
    public static void main(String[] args) 
    {
        long l1 = System.currentTimeMillis();
        System.out.println("OS  name : " + System.getProperty("os.name"));
        System.out.println("OS version : " + System.getProperty("os.version"));
        System.out.println("User name : " + System.getProperty("user.name"));
        System.out.println("Current path of system file : " + System.getProperty("user.home"));
        System.out.println("Current working directory : " + System.getProperty("user.dir"));
        System.out.println("JDK version : " + System.getProperty("java.version"));
        System.out.println("JVM version : " + System.getProperty("java.vm.version"));
        System.out.println("Separator of the line : " + System.getProperty("path.separator"));
        long l2 = System.currentTimeMillis();
        System.out.println("Time consumed to execute the program at the beginning : " + l1);
        System.out.println("Time consumed to execute the program at the end : "+ l2);
        System.out.println((l2 - l1));
    }    
}
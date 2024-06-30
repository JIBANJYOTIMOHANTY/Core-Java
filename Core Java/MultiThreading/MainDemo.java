public class MainDemo implements Runnable
{
	public static void main(String args[])
	{
		System.out.println("In main mehtod Thread name is : " +Thread.currentThread().getName());
		System.out.println("In main mehtod Thread Id is : " +Thread.currentThread().getId());
		System.out.println("In main mehtod Thread priority is : " +Thread.currentThread().getPriority());
		MainDemo md = new MainDemo();
		Thread t1 = new Thread(md);
		t1.setName("Child");
		t1.start();
	}
	@Override
	public void run()
	{
		System.out.println(" Thread name is : " +Thread.currentThread().getName());
		System.out.println(" Thread priority is : " +Thread.currentThread().getPriority());
		System.out.println(" Thread priority is : " +Thread.currentThread().getPriority());
	}
	static
	{
		System.out.println("In class block Thread name is : " +Thread.currentThread().getName());
		System.out.println("In class block Thread priority is : " +Thread.currentThread().getPriority());
		System.out.println("In class block Thread priority is : " +Thread.currentThread().getPriority());
	}
}
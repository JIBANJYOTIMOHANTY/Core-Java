public class DaemonThreadDemo extends Thread
{
	public static void main(String args[])
	{
		DaemonThreadDemo dd = new DaemonThreadDemo();
		System.out.println("Is it system defined thread : " + dd.isDaemon());
		dd.setDaemon(true);
		//User defined thread converted into System thread.
		dd.start();
		System.out.println("Is it system defined thread : " + dd.isDaemon());
	}
	@Override
	public void run()
	{
		System.out.println("Thread is running.......");
	}
}
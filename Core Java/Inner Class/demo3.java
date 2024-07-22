public abstract class demo3
{
	int data;
	public abstract void setData(int data);
	public abstract int getData();
	void call()
	{
		System.out.println("Magic of Java");
	}
	public static void main(String args[])
	{
		//Annonymous Inner Class
		demo3 dd = new demo3()
		{
			@Override
			public void setData(int data)
			{
				this.data = data;
			}
			@Override
			public int getData()
			{
				return data;
			}
		};
		dd.call();
		dd.setData(100);
		System.out.println("Data for the object is : " + dd.getData());
	}
}

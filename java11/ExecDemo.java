class MyThread implements Runnable
{
	private String name;
	private int time;
	public MyThread(String name,int time)
	{
		this.time=time;
		this.name=name;
	}
	public void run()
	{
		try
		{
			Thread.sleep(time);
		}
		catch (Exception e)
		{
		}
		System.out.println(this.name+"线程，休眠"+this.time+"毫秒");
	}
}




class ExecDemo 
{
	public static void main(String[] args) 
	{
		MyThread my1=new MyThread("线程A",10000);
		MyThread my2=new MyThread("线程B",20000);
		Thread t1=new Thread(my1);
		Thread t2=new Thread(my2);
		t1.start();
		t2.start();
	}
}

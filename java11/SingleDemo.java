
/*
单例设计模式。


*/
//饿汉式。
/*
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/


//懒汉式

class Single
{
	private static Single s = null;
	private Single(){}


	public static  Single getInstance()
	{
/*
延迟加载的单例设计模式
静态的同步方法，使用的锁是该方法所在类的字节码文件对象。 类名.class
*/
	if(s==null)
		{
		 synchronized(Single.class)
			 {
			     if(s==null)
				 
					 s=new Single();
				 
		     }
	    }
	return s;
	}
}

class SingleDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
静态代码块
格式：
static
{
	静态代码块的执行语句
}
特点：随着类的加载而执行，只执行一次
用于给类进行初始化
*/
class StaticCode
{
	/*
	构造函数给对应对象初始化
	*/
	StaticCode() 
	{
       System.out.println("c");
	}
	/*
	静态代码用于给类进行初始化
	*/
	static 
	{
       System.out.println("a");
	}
	/*
	构造代码块给对象初始化
	*/
	{
       System.out.println("b");
	}
	public static void show()
	{
       System.out.println("show");
	}
}
class StaticCodeDemo
{
	static
	{
		 //System.out.println("b");
	}
	public static void main(String[] args)
	{
	  // new StaticCode();
	  // new StaticCode();
      // System.out.println("Hello");
	  //StaticCode.show();
	  new StaticCode();
	}
	static
	{
		 //System.out.println("c");
	}
}
/*
注意三者的执行顺序
a
b
c
*/



/*
异常：程序在运行时出现的不正常情况
异常由来：java对不正常情况进行描述后的对象体现（把问题封装成对象）

问题划分：一种严重，Error类进行描述；一般不编写针对性代码进行处理
          一种非严重，Exception类进行描述；使用针对性的处理方式进行处理
两者有共性内容
Throwable
    |--Error

	|--Exception

2.异常的处理
java提供了特有的语句进行处理
try
{
  需要被检测的代码；
}
catch(异常类 变量)
{
   处理异常的代码（处理方式）；
}
finally
{
   一定会执行的语句；
}


3.对捕获到的异常对象进行常见方法操作
  String getMessage(); 获取异常的信息

在函数上声明异常
便于提高安全性，让调用出进行处理，不处理编译失败



对多异常的处理
1.声明异常时，建议声明更为具体的异常
2.对方声明几个异常，就对应几个catch块
  多个时，父类catch块放在最下面，不要定义多余catch块

建议进行catch处理时，catch中一定要定义具体处理方式

*/


class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws关键字声明该功能有可能会出现问题
	{
		int[] arr=new int[a];
		System.out.println(arr[4]);	
		return a/b;
	}
}


class ExceptionDemo2 
{
	public static void main(String[] args) //throws Exception
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);
		    System.out.println("x="+x);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("jiaobiao");
		}
		
		System.out.println("over");		
	} 
}
/*
自定义异常  (自定义继承Exception)
将特有问题，进行自定义异常封装

需求：在本程序中，对于除数是负数也视为是错误的，需要对此问题自定义描述

当在函数内部出现throw，必须给出对应的处理动作
1.在内部try catch处理 2.在函数上声明（函数内出现异常，函数要声明）

如何定义异常信息？
父类中有，子类构造时，将异常信息通过super传给父类获得

继承Exception原因：
异常类和异常对象都需要被抛出，都具备可抛性，只有这个体系中的才可以throws和throw操作

注意throws和throw的区别
*/


class FushuException extends Exception
{
	private int value;

	FushuException(String msg,int value)
	{
		super(msg); 
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}

}


class Demo
{
	int div(int a,int b)throws FushuException//在功能上通过throws关键字声明该功能有可能会出现问题
	{
        if(b<0)
		{
			throw new FushuException("fushu",b);//手动抛出自定义异常
		}

		return a/b;
	}
}


class ExceptionDemo3 
{
	public static void main(String[] args) //throws Exception
	{
		Demo d=new Demo();
        try
        {
			int x=d.div(4,-1);
		    System.out.println("x="+x);
		
        }
        catch (FushuException e)
        {
			System.out.println(e.toString()+"+负数值"+e.getValue());	
        }
		
		System.out.println("over");		
	} 
}

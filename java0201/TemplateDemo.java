/*
需求：获取一段程序运行的时间。
原理：获取程序开始和结束时间并相减。
获取时间:System.currentTimeMillis();
代码经过一系列优化解决问题。

模板方法设计模式：
在定义功能时，功能的一部分是确定的，另一部分是不确定的，而确定的部分在使用不确定的部分，
那么这时就将不确定部分暴露出去，由该类的子类去完成。
*/

//long currentTimeMillis()
abstract class GetTime
{
	public final void getTime()
	{
		long start=System.currentTimeMillis();

        /*for(int x=0;x<1000;x++)
		{
			System.out.print(x);
		}*/
		runcode();

		long end=System.currentTimeMillis();

		System.out.println("毫秒"+(end-start));
	}
	public abstract void runcode();

}
class SubTime extends GetTime
{
	public void runcode()
	{
        for(int x=0;x<1000;x++)
		{
			System.out.print(x);
		}
	}
}
class TemplateDemo 
{ 
	public static void main(String[] args) 
	{
		SubTime gt= new SubTime();
		gt.getTime();
	}
}

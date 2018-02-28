/*
匿名内部类
1.匿名内部类是内部类的简写格式
2.定义匿名内部类的前提：
  内部类必须是继承一个类或者实现接口  
3.匿名内部类的格式：new 父类或者接口（）{定义子类内容}
4.匿名内部类就是一个匿名子类对象
*/

abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x=3;
	/*
	class Inner extends AbsDemo
	{
		void show()
        {
			System.out.println("method"+x);
		}
			
	}
	*/
	public void function()
	{
		//new Inner().show();

        new AbsDemo()
		{
           void show()
           {
			System.out.println("x="+x);
		   }
		}.show();

	}
}

class InnerClassDemo4  
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}

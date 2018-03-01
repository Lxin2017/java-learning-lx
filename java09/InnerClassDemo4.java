/*
匿名内部类
1.匿名内部类是内部类的简写格式
2.定义匿名内部类的前提：
  内部类必须是继承一个类或者实现接口  
3.匿名内部类的格式：new 父类或者接口（）{定义子类内容}
4.匿名内部类就是一个匿名子类对象
5.匿名内部类中定义的方法最好不超过3个
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
		int x=9;
		void show()
        {
			System.out.println("method"+x);
		}
			
	}
*/
	public void function()
	{
		//new Inner().show();
/*
        new AbsDemo()                    
		{
           void show()
           {
			System.out.println("x="+x);
		   }
		}.show();                           //匿名内部类
*/


      AbsDemo d= new AbsDemo() 
		{
           void show()
           {
			System.out.println("x="+x);
		   }
		   void abc()
           {
			System.out.println("abc");
		   }
		};
		d.show();   //与匿名内部类功能相同
		//d.abc();  //不可以，父类中没有定义


	}
}

class InnerClassDemo4  
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}


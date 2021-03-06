/*
内部类定义在局部时
1.不可以被成员修饰符修饰
2.可以直接访问外部类成员，因为还持有外部类中的引用
  但不可以访问它所在的局部变量，只能访问被final修饰的局部变量
*/

class Outer
{
	int x=3;
	void method(final int a)
	{
		final int y=4;
		class Inner
		{
			int z=4;
			void function()
            {
				System.out.println(a);
			}
			
		}
		new Inner().function();
	}
}


class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		new Outer().method(8);
		System.out.println("Hello World!");
	}
}

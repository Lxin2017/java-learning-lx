/*
内部类
访问规则：
1.内部类可以直接访问外部类成员，包括私有
  之所以可以直接访问，是因为内部类中持有了一个外部类的引用，格式 外部类名.this.
2.外部类访问内部类，必须建立内部类对象

类中只有内部类可以被私有修饰
private:将内部类在外部类中进行封装
static:内部类就具备static的特性
当内部类被静态修饰后，只能访问外部类中的静态成员

当内部类中定义了静态成员，该内部类必须是静态的
当外部类中的静态方法访问内部类时，内部类也必须是静态的

当描述事物时，事物内部还有事物，该事物用内部类来描述。

*/

class Outer
{
	static int x=3;

    static class Inner    //内部类
    {
		void function()
	    {
			
			System.out.println("inner"+x);
	    }
    }

	void method()
	{
		Inner in=new Inner();
		in.function();
	}
}


class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		//Outer out =new Outer();
		//out.method();

		//直接访问内部类中成员
		//Outer.Inner in=new Outer().new Inner();
		//in.function();

		new Outer.Inner().function();  //访问static内部类的非静态成员
       // Outer.Inner().function();    //访问static内部类的静态成员
	}
}

/*
final:修饰符，修饰类、函数、变量
被修饰的类不能被继承；
被修饰的方法不可以被复写;
被修饰的变量是一个常量，只能赋值一次；
修饰不需要改变的常量：所有字母大写，多个单词用_连接，如MY_PI

*/


class Demo
{
	public static final double PI=3.14;
	final void show1()
	{
		System.out.println("good 1");
    }
	static void show2()
	{
		System.out.println("good 2");
    }
}
/*
class SubDemo extends Demo
{
}
*/

class FinalDemo
{
	public static void main(String[] args)
	{
		System.out.println(Demo.PI);
	//	Demo d1=new Demo();
	//	d1.show2();
	Demo.show2();
    }
}



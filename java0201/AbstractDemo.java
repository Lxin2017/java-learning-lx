/*
当多个类中出现相同功能，但功能主体不同，只抽取定义。
抽象：
1.抽象方法必须放在抽象类中；
2.抽象方法和抽象类被abstract修饰；
3.抽象类不可以用new创建对象。
4.抽象类中的抽象方法要被使用，必须由子类复写起所有的抽象方法后，建立子类调用，
  如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
5.抽象类中可以定义非抽象等方法，和一般类没有太大不同，只不过出现一些不确定部分，
  也是事物的功能，但无法定义主体。
6.抽象类可以里面没有抽象方法，只是不能创建对象。
*/
abstract class Student 
{
	abstract void study();
	//abstract void study1();
}
class BaseStudent extends Student
{
	void study() 
	{
		System.out.println("base study");
	}
}
class AdvStudent extends Student
{
	void study() 
	{
		System.out.println("adv study");
	}
}


class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

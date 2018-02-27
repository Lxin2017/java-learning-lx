/*
接口：初期理解，可以认为是特殊的抽象类，
      当抽象类的方法都是抽象的，那么该类可用接口形式表示。
class用于定义类
interface用于定义接口

接口定义格式特点：
1.接口中常见定义：常量，抽象方法
2.接口中成员都有固定修饰符
常量：public static final
方法：public abstract
记住：接口中成员都是public的。

接口：不可以创建对象；需要被子类实现，子类需要对所有方法覆盖，子类才可以实例化，
      否则子类是一个抽象类

接口可以被类多实现，也是对多继承不支持的转换形式，支持多实现。
*/

interface Inter
{
	//public static final int NUM=3;
	int NUM=3;
	//public abstract void show();
	void show();
}

interface InterA
{
	public abstract void show();
	//public abstract void method();
}

class Demo
{
	public void function(){}
}

class Test extends Demo implements Inter,InterA
{
	public void show(){}
	//public void method(){}
}

class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}


/*接口与接口之间是继承
interface A
{
}
interface B extends A
{
}
interface C extends B
{
}
interface D extends A，B
{
}
*/
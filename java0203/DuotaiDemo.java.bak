/*
多态：事物存在的多种体现形态。（人：男人，女人）

1.多态的体现
 父类的引用指向了自己的子类对象。(Animal c=new Cat();)
 父类的引用可以接收自己的子类对象。

2.多态的前提
必须是类与类之间有关系，继承或者实现
通常存在覆盖

3.多态的好处
提高了程序的扩展性

4.多态的弊端
只能使用父类的引用访问父类中的成员

5.多态的应用 

*/

/*
动物
猫，狗
*/



abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void catchmouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void kanjia()
	{
		System.out.println("看家");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("吃饲料");
	}
	public void sleep()
	{
		System.out.println("睡觉");
	}
}

class DuotaiDemo
{
	public static void main(String[] args) 
	{
		/*
		Cat c=new Cat();
		//c.eat();
        function(c);

		Dog d=new Dog();
		//d.eat();
		function(d);

		function(new Pig());
		*/
		//Animal c=new Cat();
		//c.eat();
		function(new Pig());
	}
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}
	public static void function(Pig p)
	{
		p.eat();
	}
	*/
	public static void function(Animal a)//提高了代码的扩展性
	{
		a.eat();
	}
}

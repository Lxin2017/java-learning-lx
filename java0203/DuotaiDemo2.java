/*
多态：转型
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

class DuotaiDemo2
{
	public static void main(String[] args) 
	{

		//Animal a=new Cat(); //类型提升，向上转型
		//a.eat();

        //如果想要猫的特有方法，强制将父类引用，转成子类类型,向下转型
		//Cat c=(Cat)a ;
       // c.catchmouse();
        //不要把父类对象转换成子类类型
		//转换的是父类引用指向自己子类对象时，可以强制转换
		//多态是子类对象的变化
		function(new Dog());
		function(new Cat());
	}
	


	public static void function(Animal a)
	{
		a.eat();
		if(a instanceof Cat)
		{
			Cat c=(Cat)a ;
            c.catchmouse();
		}
		else if(a instanceof Dog)
		{
			Dog c=(Dog)a ;
            c.kanjia();
		}
	}
}

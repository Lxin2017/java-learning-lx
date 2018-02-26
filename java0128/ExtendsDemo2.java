/*
继承
1.提高代码复用性
2.让类与类之间产生关系，有了多态的特性

查阅父类功能，创建子类对象使用功能

二、子父类中的函数
覆盖（重写）：子类出现和父类一模一样的函数时，调用会运行子类内容
覆盖注意：1.子类权限必须大于等于父类；
          2.静态只能覆盖静态

重载：只看重名函数的参数列表

三、构造函数
对子类对象初始化时，父类构造函数也会运行，因为有默认隐藏super();
this()和super()类似，只能存在一个，在首行；
即使子类中有一个构造函数使用this()也必会通过其它构造函数访问到父类

*/

class Fu
{
	Fu()
	{
		System.out.println("fu");
	}
	void show()
	{
		System.out.println("good fu");
    }
}
class Zi extends Fu
{
	Zi()
	{
		//super();
		System.out.println("zi");
	}
	void show()
	{
		System.out.println("good zi");
    }
}

class ExtendsDemo2
{
	public static void main(String[] args)
	{
		Zi z=new Zi();
		z.show();
		System.out.println("l");
    }
}


/* 可直接调用
class Person
{
	private String name;
	Person(String name)
	{
		this.name=name;
	}
	void show(){}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
	void method()
	{
        super.show();
	}
}
*/
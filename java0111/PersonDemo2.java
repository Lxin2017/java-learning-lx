/*
构造函数
当一个类中没有定义构造函数是，系统会加一个空参数的构造函数。
*/
/*
this:区分局部变量与成员变量同名的情况；
代表本类的对象，代表它所在函数所属对象的引用。
应用：当定义类中功能时，该函数内部要调用该函数对象时，用this表示这个对象。
this只能用在构造函数第一行，因为初始化要先执行
*/
class Person
{
	private String name;
	private int age;
	Person()
	{
        System.out.println("A:name="+name);
	}
	Person(String name)
	{
		this.name=name;
        System.out.println("B:name="+name);
	}
	Person(String name,int age)
	{
		this(name);//this用于构造函数之间进行互相调用
        System.out.println("C:name="+name);
	}
	Person(int age)
	{
		this.age=age;
        System.out.println("age="+age);
	}
	public boolean compare(Person p)
	{
		return this.age==p.age;

	}
}

class PersonDemo2
{
	public static void main(String[] args) 
	{
		Person p=new Person(20);
		Person p2=new Person("L",15);
		boolean b=p.compare(p2);
		System.out.println(b);

	}
}
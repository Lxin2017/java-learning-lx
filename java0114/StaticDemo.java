/*
static静态
用法：是一个修饰符，用于修饰成员（成员变量和成员函数）

static特点：
1.随着类的加载而加载
2.优先于的对象存在 
3.被所有对象所共享
4.当成员被静态修饰后，除了被对象调用，还可以直接被类名调用。（类名.静态成员）

static使用注意对象：
1.静态方法只能访问静态成员
2.静态方法中不可以定义this，super关键字，因为静态优先于的对象存在
3.主函数是静态的
*/
class Person
{
	String name;//实例变量
	static String country="CN";//类变量
	public void show()
	{
		System.out.println(name+"::"+country);		
	}
}

class StaticDemo
{
	public static void main(String[] args) 
	{
		//Person p=new Person();
		//p.name="ll";
		//p.show();
		System.out.println(Person.country);	

	}
}

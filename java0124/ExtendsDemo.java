/*
继承
1.提高代码复用性
2.让类与类之间产生关系，有了多态的特性

查阅父类功能，创建子类对象使用功能

*/

class Person
{
	String name;
	int age;
}
class Student extends Person
{

	void study()
	{
		System.out.println("good study");
    }
}
class Worker extends Person
{

	void work()
	{
		System.out.println("good work");
    }
}


class ExtendsDemo
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.name="lx";
		s.study();
		System.out.println(s.name);
    }
}



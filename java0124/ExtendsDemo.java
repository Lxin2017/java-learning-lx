/*
�̳�
1.��ߴ��븴����
2.��������֮�������ϵ�����˶�̬������

���ĸ��๦�ܣ������������ʹ�ù���

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


/*
���캯��
��һ������û�ж��幹�캯���ǣ�ϵͳ���һ���ղ����Ĺ��캯����
*/
/*
this:���־ֲ��������Ա����ͬ���������
��������Ķ��󣬴��������ں���������������á�
Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ���øú�������ʱ����this��ʾ�������
thisֻ�����ڹ��캯����һ�У���Ϊ��ʼ��Ҫ��ִ��
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
		this(name);//this���ڹ��캯��֮����л������
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
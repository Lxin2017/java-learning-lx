/*
�̳�
1.��ߴ��븴����
2.��������֮�������ϵ�����˶�̬������

���ĸ��๦�ܣ������������ʹ�ù���

�����Ӹ����еĺ���
���ǣ���д����������ֺ͸���һģһ���ĺ���ʱ�����û�������������
����ע�⣺1.����Ȩ�ޱ�����ڵ��ڸ��ࣻ
          2.��ֻ̬�ܸ��Ǿ�̬

���أ�ֻ�����������Ĳ����б�

�������캯��
����������ʼ��ʱ�����๹�캯��Ҳ�����У���Ϊ��Ĭ������super();
this()��super()���ƣ�ֻ�ܴ���һ���������У�
��ʹ��������һ�����캯��ʹ��this()Ҳ�ػ�ͨ���������캯�����ʵ�����

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


/* ��ֱ�ӵ���
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
/*
��̬��ת��
*/

abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchmouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanjia()
	{
		System.out.println("����");
	}
}

class DuotaiDemo2
{
	public static void main(String[] args) 
	{

		//Animal a=new Cat(); //��������������ת��
		//a.eat();

        //�����Ҫè�����з�����ǿ�ƽ��������ã�ת����������,����ת��
		//Cat c=(Cat)a ;
       // c.catchmouse();
        //��Ҫ�Ѹ������ת������������
		//ת�����Ǹ�������ָ���Լ��������ʱ������ǿ��ת��
		//��̬���������ı仯
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

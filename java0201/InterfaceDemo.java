/*
�ӿڣ�������⣬������Ϊ������ĳ����࣬
      ��������ķ������ǳ���ģ���ô������ýӿ���ʽ��ʾ��
class���ڶ�����
interface���ڶ���ӿ�

�ӿڶ����ʽ�ص㣺
1.�ӿ��г������壺���������󷽷�
2.�ӿ��г�Ա���й̶����η�
������public static final
������public abstract
��ס���ӿ��г�Ա����public�ġ�

�ӿڣ������Դ���������Ҫ������ʵ�֣�������Ҫ�����з������ǣ�����ſ���ʵ������
      ����������һ��������

�ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��֧�ֶ�ʵ�֡�
*/

interface Inter
{
	//public static final int NUM=3;
	int NUM=3;
	//public abstract void show();
	void show();
}

interface InterA
{
	public abstract void show();
	//public abstract void method();
}

class Demo
{
	public void function(){}
}

class Test extends Demo implements Inter,InterA
{
	public void show(){}
	//public void method(){}
}

class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}


/*�ӿ���ӿ�֮���Ǽ̳�
interface A
{
}
interface B extends A
{
}
interface C extends B
{
}
interface D extends A��B
{
}
*/
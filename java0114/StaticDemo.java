/*
static��̬
�÷�����һ�����η����������γ�Ա����Ա�����ͳ�Ա������

static�ص㣺
1.������ļ��ض�����
2.�����ڵĶ������ 
3.�����ж���������
4.����Ա����̬���κ󣬳��˱�������ã�������ֱ�ӱ��������á�������.��̬��Ա��

staticʹ��ע�����
1.��̬����ֻ�ܷ��ʾ�̬��Ա
2.��̬�����в����Զ���this��super�ؼ��֣���Ϊ��̬�����ڵĶ������
3.�������Ǿ�̬��
*/
class Person
{
	String name;//ʵ������
	static String country="CN";//�����
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
/*
�ڲ��ඨ���ھֲ�ʱ
1.�����Ա���Ա���η�����
2.����ֱ�ӷ����ⲿ���Ա����Ϊ�������ⲿ���е�����
  �������Է��������ڵľֲ�������ֻ�ܷ��ʱ�final���εľֲ�����
*/

class Outer
{
	int x=3;
	void method(final int a)
	{
		final int y=4;
		class Inner
		{
			int z=4;
			void function()
            {
				System.out.println(a);
			}
			
		}
		new Inner().function();
	}
}


class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		new Outer().method(8);
		System.out.println("Hello World!");
	}
}

/*
�����ڲ���
1.�����ڲ������ڲ���ļ�д��ʽ
2.���������ڲ����ǰ�᣺
  �ڲ�������Ǽ̳�һ�������ʵ�ֽӿ�  
3.�����ڲ���ĸ�ʽ��new ������߽ӿڣ���{������������}
4.�����ڲ������һ�������������
*/

abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x=3;
	/*
	class Inner extends AbsDemo
	{
		void show()
        {
			System.out.println("method"+x);
		}
			
	}
	*/
	public void function()
	{
		//new Inner().show();

        new AbsDemo()
		{
           void show()
           {
			System.out.println("x="+x);
		   }
		}.show();

	}
}

class InnerClassDemo4  
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}

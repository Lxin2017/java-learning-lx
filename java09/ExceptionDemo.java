/*
�쳣������������ʱ���ֵĲ��������
�쳣������java�Բ������������������Ķ������֣��������װ�ɶ���

���⻮�֣�һ�����أ�Error�����������һ�㲻��д����Դ�����д���
          һ�ַ����أ�Exception�����������ʹ������ԵĴ���ʽ���д���
�����й�������
Throwable
    |--Error

	|--Exception

2.�쳣�Ĵ���
java�ṩ�����е������д���
try
{
  ��Ҫ�����Ĵ��룻
}
catch(�쳣�� ����)
{
   �����쳣�Ĵ��루����ʽ����
}
finally
{
   һ����ִ�е���䣻
}


3.�Բ��񵽵��쳣������г�����������
  String getMessage(); ��ȡ�쳣����Ϣ


*/


class Demo
{
	int div(int a,int b)
	{
		return a/b;
	}
}


class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)//Exception e=new ArithmeticExcetion();
		{
			System.out.println("��������");
			System.out.println(e.getMessage()); //    /by zero;
		    System.out.println(e.toString());   //  �쳣���� �� �쳣��Ϣ
			e.printStackTrace();       //��ʵjvmĬ�ϵ��쳣������ƾ��ǵ���printStackTrace������
			                           //��ӡ�쳣�Ķ�ջ������Ϣ
		}
		
		System.out.println("over");
	} 
}

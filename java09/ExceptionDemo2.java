
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

�ں����������쳣
������߰�ȫ�ԣ��õ��ó����д������������ʧ��



�Զ��쳣�Ĵ���
1.�����쳣ʱ������������Ϊ������쳣
2.�Է����������쳣���Ͷ�Ӧ����catch��
  ���ʱ������catch����������棬��Ҫ�������catch��

�������catch����ʱ��catch��һ��Ҫ������崦��ʽ

*/


class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�ؼ��������ù����п��ܻ��������
	{
		int[] arr=new int[a];
		System.out.println(arr[4]);	
		return a/b;
	}
}


class ExceptionDemo2 
{
	public static void main(String[] args) //throws Exception
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);
		    System.out.println("x="+x);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("jiaobiao");
		}
		
		System.out.println("over");		
	} 
}
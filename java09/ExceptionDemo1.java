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
	int div(int a,int b)throws Exception//�ڹ�����ͨ��throws�ؼ��������ù����п��ܻ��������
	{
		return a/b;
	}
}


class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		
		int x=d.div(4,0);
		System.out.println("x="+x);
		
		System.out.println("over");
	} 
}
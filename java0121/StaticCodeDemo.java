/*
��̬�����
��ʽ��
static
{
	��̬������ִ�����
}
�ص㣺������ļ��ض�ִ�У�ִֻ��һ��
���ڸ�����г�ʼ��
*/
class StaticCode
{
	/*
	���캯������Ӧ�����ʼ��
	*/
	StaticCode() 
	{
       System.out.println("c");
	}
	/*
	��̬�������ڸ�����г�ʼ��
	*/
	static 
	{
       System.out.println("a");
	}
	/*
	��������������ʼ��
	*/
	{
       System.out.println("b");
	}
	public static void show()
	{
       System.out.println("show");
	}
}
class StaticCodeDemo
{
	static
	{
		 //System.out.println("b");
	}
	public static void main(String[] args)
	{
	  // new StaticCode();
	  // new StaticCode();
      // System.out.println("Hello");
	  //StaticCode.show();
	  new StaticCode();
	}
	static
	{
		 //System.out.println("c");
	}
}
/*
ע�����ߵ�ִ��˳��
a
b
c
*/

/*
��������г�����ͬ���ܣ����������岻ͬ��ֻ��ȡ���塣
����
1.���󷽷�������ڳ������У�
2.���󷽷��ͳ����౻abstract���Σ�
3.�����಻������new��������
4.�������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽���������ã�
  �������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ
5.�������п��Զ���ǳ���ȷ�������һ����û��̫��ͬ��ֻ��������һЩ��ȷ�����֣�
  Ҳ������Ĺ��ܣ����޷��������塣
6.�������������û�г��󷽷���ֻ�ǲ��ܴ�������
*/
abstract class Student 
{
	abstract void study();
	//abstract void study1();
}
class BaseStudent extends Student
{
	void study() 
	{
		System.out.println("base study");
	}
}
class AdvStudent extends Student
{
	void study() 
	{
		System.out.println("adv study");
	}
}


class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

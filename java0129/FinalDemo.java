/*
final:���η��������ࡢ����������
�����ε��಻�ܱ��̳У�
�����εķ��������Ա���д;
�����εı�����һ��������ֻ�ܸ�ֵһ�Σ�
���β���Ҫ�ı�ĳ�����������ĸ��д�����������_���ӣ���MY_PI

*/


class Demo
{
	public static final double PI=3.14;
	final void show1()
	{
		System.out.println("good 1");
    }
	static void show2()
	{
		System.out.println("good 2");
    }
}
/*
class SubDemo extends Demo
{
}
*/

class FinalDemo
{
	public static void main(String[] args)
	{
		System.out.println(Demo.PI);
	//	Demo d1=new Demo();
	//	d1.show2();
	Demo.show2();
    }
}



class  Fu
{
	int num=5;
	void method1()
    {
        System.out.println("fu 1");
    }
    void method2()
    {
        System.out.println("fu 2");
    }
	static void method4()
    {
        System.out.println("fu 4");
    }

}

class Zi extends Fu
{
	int num=6;
	void method1()
    {
        System.out.println("zi 1");
    }
    void method3()
    {
        System.out.println("zi 3");
    }
	static void method4()
    {
        System.out.println("zi 4");
    }

	
}
class DuotaiDemo4
{
	public static void main(String[] args) 
	{
		Fu f=new Zi();
		f.method4();
		//System.out.println(f.num);
		//f.method1();
		//f.method2();
		//f.method3();
/*
�ڶ�̬�зǾ�̬��Ա�������ص㣺
�ڱ���ʱ�ڣ����������ͱ������������У�����У�����ͨ����
������ʱ�ڣ����Ķ������������еķ�����
�ܽ᣺��Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұ�

�ڶ�̬�г�Ա�������ص㣺
��������У������������ͱ����������ࡣ

�ڶ�̬�У���̬��Ա�����ص㣺
��������У������������ͱ����������ࡣ
*/
	}
}
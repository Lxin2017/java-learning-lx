/*

ͨ�����������֣���ӡ��0��-1��-2�ȴ�Ʊ��

���̵߳����г����˰�ȫ���⡣

�����ԭ��
	����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣���û��ִ���꣬
	��һ���̲߳������ִ�С����¹������ݵĴ���

����취��
	�Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���ꡣ��ִ�й����У������̲߳����Բ���ִ�С�

Java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ��

����ͬ������顣

synchronized(����)
{
	��Ҫ��ͬ���Ĵ���

}
������ͬ�������������߳̿�����ͬ����ִ�С�
û�г��������̼߳�ʹ��ȡcpu��ִ��Ȩ��Ҳ����ȥ����Ϊû�л�ȡ����


ͬ����ǰ�᣺
1������Ҫ�����������������ϵ��̡߳�
2�������Ƕ���߳�ʹ��ͬһ������

���뱣֤ͬ����ֻ����һ���߳������С�


�ô�������˶��̵߳İ�ȫ���⡣

�׶ˣ�����߳���Ҫ�ж�������Ϊ������Դ��

*/
class Ticket implements Runnable
{
	private  int tick = 100;
	Object obj = new Object();
	public void run()//��д�ӿں���run������throw
	{
		while(true)
		{
			synchronized(obj)
			{
				if(tick>0)
				{
					try{Thread.sleep(10);}catch(Exception e){}
					System.out.println(Thread.currentThread().getName()+"....sale : "+ tick--);
				}
			}
		}
	}
}


class  TicketDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}
}


/*

ʵ��Runable�ӿ�

���裺
1��������ʵ��Runnable�ӿ�
2������Runnable�ӿ��е�run������
	���߳�Ҫ���еĴ������ڸ�run�����С�

3��ͨ��Thread�ཨ���̶߳���
4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
	ΪʲôҪ��Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯����
	��Ϊ���Զ����run���������Ķ�����Runnable�ӿڵ��������
	����Ҫ���߳�ȥָ��ָ�������run�������ͱ�����ȷ��run������������


5������Thread���start���������̲߳�����Runnable�ӿ������run������



ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�

ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��

���ַ�ʽ����
�̳�Thread:�̴߳�����Thread����run�����С�
ʵ��Runnable���̴߳�����ڽӿڵ������run������



*/
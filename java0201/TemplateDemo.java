/*
���󣺻�ȡһ�γ������е�ʱ�䡣
ԭ������ȡ����ʼ�ͽ���ʱ�䲢�����
��ȡʱ��:System.currentTimeMillis();
���뾭��һϵ���Ż�������⡣

ģ�巽�����ģʽ��
�ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ���һ�����ǲ�ȷ���ģ���ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣�
��ô��ʱ�ͽ���ȷ�����ֱ�¶��ȥ���ɸ��������ȥ��ɡ�
*/

//long currentTimeMillis()
abstract class GetTime
{
	public final void getTime()
	{
		long start=System.currentTimeMillis();

        /*for(int x=0;x<1000;x++)
		{
			System.out.print(x);
		}*/
		runcode();

		long end=System.currentTimeMillis();

		System.out.println("����"+(end-start));
	}
	public abstract void runcode();

}
class SubTime extends GetTime
{
	public void runcode()
	{
        for(int x=0;x<1000;x++)
		{
			System.out.print(x);
		}
	}
}
class TemplateDemo 
{ 
	public static void main(String[] args) 
	{
		SubTime gt= new SubTime();
		gt.getTime();
	}
}
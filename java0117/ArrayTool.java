/*
ʲôʱ��ʹ�þ�̬
ʲôʱ���徲̬������
�������г��ֹ�������ʱ�������ݱ���̬�����Ρ�
ʲôʱ���徲̬������
�������ڲ�û�з��ʵ��Ǿ�̬���ݣ��ù��ܿ��Զ���ɾ�̬


��̬��Ӧ��:���ܵķ�װ
ÿ��Ӧ���ж��й��ԵĹ��ܣ����Խ���Щ���ܽ��г�ȡ��������װ���Ա㸴�á�
ͨ���������ﶨ��Ķ��Ǿ�̬����
���ڸ����Կɱ���������������Ϊ�˸����Ͻ������Խ����캯��˽�л����
*/


/**
����һ�����Զ�������в����Ĺ����࣬�ṩ�˻�ȡ��ֵ�Ĺ���
@author lx
@version V1.1
*/
public class ArrayTool
{
	/**
	�ղ������캯��
	*/
	private ArrayTool(){}
	/**
	��ȡһ�����������е����ֵ
	@param arr ����һ��int���͵�����
	@return ����һ�������е����ֵ
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	public static int getMin(int[] arr)
	{
        int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
}


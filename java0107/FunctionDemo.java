/*
���������ʽ
���η� ����ֵ���� ���������������� ��ʽ����...��
{
	ִ�����
	return ����ֵ
}
�޷���ֵʱ��void
*/

class FunctionDemo
{

	public static void main(String[] args) 
	{
		int x=getResult(4);
		System.out.println("x="+x);
		getResult2(4);
	}

	public static int getResult(int num)
    {
	    return num*3+5;
    }
	public static void getResult2(int num)
    {
	    System.out.println(num*3+5);
    }
}

/*
�Զ����쳣  (�Զ���̳�Exception)
���������⣬�����Զ����쳣��װ

�����ڱ������У����ڳ����Ǹ���Ҳ��Ϊ�Ǵ���ģ���Ҫ�Դ������Զ�������

���ں����ڲ�����throw�����������Ӧ�Ĵ�����
1.���ڲ�try catch���� 2.�ں����������������ڳ����쳣������Ҫ������

��ζ����쳣��Ϣ��
�������У����๹��ʱ�����쳣��Ϣͨ��super����������

�̳�Exceptionԭ��
�쳣����쳣������Ҫ���׳������߱������ԣ�ֻ�������ϵ�еĲſ���throws��throw����

ע��throws��throw������
*/


class FushuException extends Exception
{
	private int value;

	FushuException(String msg,int value)
	{
		super(msg); 
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}

}


class Demo
{
	int div(int a,int b)throws FushuException//�ڹ�����ͨ��throws�ؼ��������ù����п��ܻ��������
	{
        if(b<0)
		{
			throw new FushuException("fushu",b);//�ֶ��׳��Զ����쳣
		}

		return a/b;
	}
}


class ExceptionDemo3 
{
	public static void main(String[] args) //throws Exception
	{
		Demo d=new Demo();
        try
        {
			int x=d.div(4,-1);
		    System.out.println("x="+x);
		
        }
        catch (FushuException e)
        {
			System.out.println(e.toString()+"+����ֵ"+e.getValue());	
        }
		
		System.out.println("over");		
	} 
}

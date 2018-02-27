/*
Object:���ж���ֱ�ӻ��Ӹ���
���ඨ�����ж���߱��Ĺ���

Object�����ṩ�˶����Ƿ���ͬ�ıȽϷ���
�Զ�����������ͬ���ܣ����Ǽ��ɡ�
(�����븲��:�����ĸ���������͸���֮��Ĺ�ϵ���Ǵ�ֱ��ϵ��������������ͬһ�����з���֮��Ĺ�ϵ����ˮƽ��ϵ��)
*/


class Demo  //extends Object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}
	public boolean equals(Object obj)//Object obj=new Demo();
	{
		if(!(obj instanceof Demo)) return false;
		Demo d=(Demo)obj;
		return this.num==d.num;	
	}
}

class ObjectDemo
{
	public static void main(String[] args) 
	{
		//Demo d1=new Demo();
        //Demo d2=new Demo();
        //System.out.println(d1.equals(d2));   //��ʵ�Ƚϵ��ǵ�ַ
		Demo d1=new Demo(4);
        Demo d2=new Demo(5);
		Class c=d1.getClass();
		System.out.println(d1.equals(d2)); 
	    System.out.println(c.getName());  
        System.out.println(Integer.toHexString(d1.hashCode())); 
		System.out.println(d1.toString());   
		  
	}
}

/*
�ڲ���
���ʹ���
1.�ڲ������ֱ�ӷ����ⲿ���Ա������˽��
  ֮���Կ���ֱ�ӷ��ʣ�����Ϊ�ڲ����г�����һ���ⲿ������ã���ʽ �ⲿ����.this.
2.�ⲿ������ڲ��࣬���뽨���ڲ������

����ֻ���ڲ�����Ա�˽������
private:���ڲ������ⲿ���н��з�װ
static:�ڲ���;߱�static������
���ڲ��౻��̬���κ�ֻ�ܷ����ⲿ���еľ�̬��Ա

���ڲ����ж����˾�̬��Ա�����ڲ�������Ǿ�̬��
���ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ�����Ǿ�̬��

����������ʱ�������ڲ�����������������ڲ�����������

*/

class Outer
{
	static int x=3;

    static class Inner    //�ڲ���
    {
		void function()
	    {
			
			System.out.println("inner"+x);
	    }
    }

	void method()
	{
		Inner in=new Inner();
		in.function();
	}
}


class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		//Outer out =new Outer();
		//out.method();

		//ֱ�ӷ����ڲ����г�Ա
		//Outer.Inner in=new Outer().new Inner();
		//in.function();

		new Outer.Inner().function();  //����static�ڲ���ķǾ�̬��Ա
       // Outer.Inner().function();    //����static�ڲ���ľ�̬��Ա
	}
}
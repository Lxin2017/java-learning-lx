class BreakDemo 
{
	public static void main(String[] args) 
	{
		
		//��ţ���ѭ�������֣�break����
		w:for(int x = 0;x<3;x++)
		{
			q:for(int y=0;y<4;y++)
			{
				System.out.println("x="+x);
				break w;
			}
		}
	}
}
//continue:ѭ������������ѭ���������´�ѭ��
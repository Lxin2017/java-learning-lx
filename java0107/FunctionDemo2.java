/*
��ζ���һ��������
1.ȷ��������
2.�����������Ҫ�õ��Ĳ���
3.����
*/

class FunctionDemo2
{

	public static void main(String[] args) 
	{
	getResult(4,6)	;
	}


	public static void getResult(int row,int col)
    {
	   for(int x=0;x<row;x++)
		{
		   for(int y=0;y<col;y++)
			{
			   System.out.print("*");
		    }
		    System.out.println("*");
	     }
       
    }




}

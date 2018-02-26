/*
如何定义一个函数？
1.确定运算结果
2.运算过程中需要用到的参数
3.过程
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

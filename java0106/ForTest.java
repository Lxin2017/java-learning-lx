/*
获取1-10的和
*/

class ForTest 
{
	public static void main(String[] args) 
	{
		//定义变量，用于存储不断变化的和
		int sum = 0;
        //定义循环，重复加法过程
		for(int x = 1;x<=10;x++)
		{
         sum =sum + x; 
		}
		
		
		System.out.println("sum="+sum);
	}
}

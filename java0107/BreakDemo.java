class BreakDemo 
{
	public static void main(String[] args) 
	{
		
		//标号，给循环起名字，break可用
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
//continue:循环，结束本次循环，继续下次循环
/*
十进制转十六进制查表法
*/

class  ArrayTest3
{
	public static void main(String[] args) 
	{
		toHex(60);
	}


    public static void toHex(int num) 
	{
		char[] chs={'0','1','2','3',
			        '4','5','6','7',
			        '8','9','A','B',
			        'C','D','E','F'};
		char[] arr=new char[8];
        for(int x=0;x<8;x++)
		{
			int t=num & 15;
			arr[x] =chs[t];
			num =num>>>4;
			
		}
		for(int x=arr.length-1;x>=0;x--)
		{
			System.out.print(arr[x]);	
		}
			
	}

}
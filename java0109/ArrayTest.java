/*
获取数组中的最值
*/

class  ArrayTest
{
	public static void main(String[] args) 
	{
		int[] arr={5,6,8,2};
		int max=getMax(arr);
		System.out.println(max);
	}

    public static int getMax(int[] arr) 
	{
		int max = arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
	}

}

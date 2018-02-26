/*
数组排序从小到大
*/

//选择排序
/*class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{3,1,6,8};
		printArr(arr);
		sort(arr);
		printArr(arr);
		System.out.println("Hello World!");
	}


    public static void sort(int[] arr) 
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					int t=arr[x];
					arr[x]=arr[y];
					arr[y]=t;
				}
			}
		}
	}


    public static void printArr(int[] arr)
    {
		for(int x=0;x<arr.length;x++)
	    {
           System.out.println("arr["+x+"]="+arr[x]);
		}
	}


}
*/

//冒泡排序
class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{3,1,6,8,2};
		printArr(arr);
		sort(arr);
		printArr(arr);
	}


    public static void sort(int[] arr) 
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)
			{
				if(arr[y]>arr[y+1])
				{
					int t=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=t;
				}
			}
		}
	}


    public static void printArr(int[] arr)
    {
		for(int x=0;x<arr.length;x++)
	    {
           System.out.println("arr["+x+"]="+arr[x]);
		}
	}


}
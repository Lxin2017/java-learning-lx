/*
class ArrayDemo
{
	public static void main(String[] args) 
	{
		int[] x=new int[]{2,4,5,6};
		System.out.println(x[1]);
	}
}
*/

/*
class ArrayDemo
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{2,4,5,6,8,9};
		for(int x=0;x<6;x++)
		{
			System.out.println("arr["+x+"]="+arr[x]);
		}
	}
}
*/

//length,��ȡ����Ԫ�ظ���
class ArrayDemo
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{2,4,5,6,8,9};
        printArr(arr);
		int sum=0;
		for(int x=0;x<arr.length;x++)
		{
			sum=sum+arr[x];
			
		}
		System.out.println(sum);
	}
//���幦�ܣ����ڴ�ӡ�����е�Ԫ��
    public static void printArr(int[] arr)
    {
		for(int x=0;x<arr.length;x++)
	    {
           System.out.println("arr["+x+"]="+arr[x]);
		}
	}

}

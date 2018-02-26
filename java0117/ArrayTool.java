/*
什么时候使用静态
什么时候定义静态变量？
当对象中出现共享数据时，该数据被静态所修饰。
什么时候定义静态函数？
当功能内部没有访问到非静态数据，该功能可以定义成静态


静态的应用:功能的封装
每个应用中都有共性的功能，可以将这些功能进行抽取，独立封装，以便复用。
通常工具类里定义的都是静态方法
由于该类仍可被其他程序建立对象，为了更加严谨，可以将构造函数私有化完成
*/


/**
这是一个可以对数组进行操作的工具类，提供了获取最值的功能
@author lx
@version V1.1
*/
public class ArrayTool
{
	/**
	空参数构造函数
	*/
	private ArrayTool(){}
	/**
	获取一个整形数组中的最大值
	@param arr 接受一个int类型的数组
	@return 返回一个数组中的最大值
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	public static int getMin(int[] arr)
	{
        int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
}


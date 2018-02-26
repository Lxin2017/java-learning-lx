/*
函数定义格式
修饰符 返回值类型 函数名（参数类型 形式参数...）
{
	执行语句
	return 返回值
}
无返回值时用void
*/

class FunctionDemo
{

	public static void main(String[] args) 
	{
		int x=getResult(4);
		System.out.println("x="+x);
		getResult2(4);
	}

	public static int getResult(int num)
    {
	    return num*3+5;
    }
	public static void getResult2(int num)
    {
	    System.out.println(num*3+5);
    }
}

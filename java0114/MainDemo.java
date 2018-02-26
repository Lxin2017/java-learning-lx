/*
主函数是一个特殊的函数。作为程序入口，可被java调用。
主函数的定义中：
public：代表着该函数访问权限最大
static：代表主函数随着类的加载就已经存在了
void：没有返回值
main：不是关键字，是特殊单词被jvm识别
函数参数(String[] arr):参数类型是一个数组，该数组中的元素是字符串。 
*/
class MainDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
	}
}
class MainDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("ab");
	}
}

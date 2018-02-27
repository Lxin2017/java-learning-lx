/*
基本功能定义在类中，扩展功能定义在接口中
*/

abstract class Student 
{
	abstract void study(); 
	void sleep()
	{
		System.out.println("sleep");
	}
}

interface Smoking
{
	void smoke();
}

class ZS extends Student implements Smoking
{
	void study(){}
	public void smoke(){}
}

class LS extends Student 
{
	void study(){}
}

class InterfaceTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

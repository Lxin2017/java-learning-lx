class  Fu
{
	int num=5;
	void method1()
    {
        System.out.println("fu 1");
    }
    void method2()
    {
        System.out.println("fu 2");
    }
	static void method4()
    {
        System.out.println("fu 4");
    }

}

class Zi extends Fu
{
	int num=6;
	void method1()
    {
        System.out.println("zi 1");
    }
    void method3()
    {
        System.out.println("zi 3");
    }
	static void method4()
    {
        System.out.println("zi 4");
    }

	
}
class DuotaiDemo4
{
	public static void main(String[] args) 
	{
		Fu f=new Zi();
		f.method4();
		//System.out.println(f.num);
		//f.method1();
		//f.method2();
		//f.method3();
/*
在多态中非静态成员函数的特点：
在编译时期，参阅引用型变量所属的类中，如果有，编译通过；
在运行时期，参阅对象所属的类中的方法。
总结：成员函数在多态调用时，编译看左边，运行看右边

在多态中成员变量的特点：
编译和运行，都参阅引用型变量所属的类。

在多态中，静态成员函数特点：
编译和运行，都参阅引用型变量所属的类。
*/
	}
}
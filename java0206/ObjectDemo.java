/*
Object:所有对象直接或间接父类
该类定义所有对象具备的功能

Object类中提供了对象是否相同的比较方法
自定义中若有相同功能，覆盖即可。
(重载与覆盖:方法的覆盖是子类和父类之间的关系，是垂直关系；方法的重载是同一个类中方法之间的关系，是水平关系。)
*/


class Demo  //extends Object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}
	public boolean equals(Object obj)//Object obj=new Demo();
	{
		if(!(obj instanceof Demo)) return false;
		Demo d=(Demo)obj;
		return this.num==d.num;	
	}
}

class ObjectDemo
{
	public static void main(String[] args) 
	{
		//Demo d1=new Demo();
        //Demo d2=new Demo();
        //System.out.println(d1.equals(d2));   //其实比较的是地址
		Demo d1=new Demo(4);
        Demo d2=new Demo(5);
		Class c=d1.getClass();
		System.out.println(d1.equals(d2)); 
	    System.out.println(c.getName());  
        System.out.println(Integer.toHexString(d1.hashCode())); 
		System.out.println(d1.toString());   
		  
	}
}

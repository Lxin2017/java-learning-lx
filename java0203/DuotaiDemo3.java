/*
多态的应用
*/


abstract class Student
{
	public abstract void study();
	public void sleep()
	{
        System.out.println("睡觉");
	}
}

class DoStudent
{
	public void dosome(Student s)
	{
		s.study();
        s.sleep();
	}

}

class BaseStudent extends Student
{
    public void study()
	{
        System.out.println("base");
	}
}

class AdvStudent extends Student
{
    public void study()
	{
        System.out.println("adv");
	}
}



class DuotaiDemo3 
{
	public static void main(String[] args) 
	{
		DoStudent ds=new DoStudent();
		ds.dosome(new BaseStudent());
		ds.dosome(new AdvStudent());
		//BaseStudent bs=new BaseStudent();
        //AdvStudent as=new AdvStudent();
	}

}

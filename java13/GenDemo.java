
class Info<T>
{
	private T var;
	public T getVar()
	{
		return var;
	}
	public void setVar(T var)
	{
		this.var=var;
	}
	public String toString()
	{
		return this.var.toString();
	}
}


class GenDemo
{
	public static void main(String[] args) 
	{
		System.out.println("\"hello\"equals");
	}
}

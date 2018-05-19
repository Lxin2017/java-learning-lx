import java.util.regex.Pattern;
class RegexDemoI 
{
	public static void main(String[] args) 
	{
		String str="12";
		String regex="\\d*";
//		if(Pattern.compile(regex).matcher(str).matches())
		if(str.matches(regex))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}

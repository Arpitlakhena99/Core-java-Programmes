package strings;

public class string9 {
	public static void main(String []args)
	{
		String s="AB12#d4@";
		String a="",n="",sc="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a' && c<='z'))
			{
				a=a+c;
			}
			else if(c>='0'&&c<='9')
			{
				n=n+c;
			}
			else
			{
				sc=sc+c;
			}
		}
		System.out.println(a+n+sc);
	}

}
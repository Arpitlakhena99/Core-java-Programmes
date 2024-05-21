package loopspractice;
public class pattern33{
	public static void main(String []args)
	{
String s="jspiders";
	int n=s.length()/2;
	String rev="";
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		for(int i=n;i<s.length();i++)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}
}
		
package strings;

public class string16 {
	public static void main(String []args)
	{
	String s = "abcatghabrcattabacat";
	int count=0;
		for(int i=0;i<s.length()-1;i++)
			{
     if(s.charAt(i)=='c' && s.charAt(i+1)=='a' && s.charAt(i+2)=='t')
		{
		count++;
		}
		 }
	System.out.println(count);
	}
}	

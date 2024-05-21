package loopspractice;

public class class33 {
public static void main(String[] args) {
	String s="aabbbccyyffg";
	s=s+" ";
	int c=1;
	String ans="";
	for(int i=0;i<s.length()-1;i++)
	{
	 if(s.charAt(i)==s.charAt(i+1))
		{
		  c++;
			 }
		else
			{
		ans =ans+s.charAt(i)+c;
		c=1;
		   }
		}
	System.out.println(ans);
	}
}

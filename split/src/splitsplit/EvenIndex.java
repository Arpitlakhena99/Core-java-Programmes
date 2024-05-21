package splitsplit;

public class EvenIndex {
static void reverse (String s)
{
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.print(rev+" ");
}
public static void main(String[] args) {
	String s="hello hi bye welcome";
	String[] arr=s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
		{
			System.out.print(arr[i]+" ");
		}
		else {
			reverse(arr[i]);
		}
	}
}
}

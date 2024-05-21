package splitsplit;
public class LongestString {
static int count (String s)
{
	int c =s.length();
	return c;
}
public static void main(String[] args) {
	String s="HELLO HI BYE WELCOME AWESOME";
	String[] arr=s.split(" ");
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		int c=count(arr[i]);		
			if(c>max)
			{
				max=c;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(count(arr[i])==max)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}

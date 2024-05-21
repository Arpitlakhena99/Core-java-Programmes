package loopspractice;

public class pattern26 {
	public static void main(String[]args)
	{
		int n=10;
		int x=n;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<2*n;j++)
		{
			if(j==x||j==n+i-1)
			{
				System.out.print("A");
			}
			else if((j>=x)!=false && j<=n+i-1 &&i==n/2+1)
			{
				System.out.print("a");
			}
			else
			{
				System.out.print(" ");	
			}
		}
		System.out.println();
		x--;
		}
	}
}

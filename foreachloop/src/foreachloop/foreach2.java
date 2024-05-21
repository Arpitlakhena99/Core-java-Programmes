package foreachloop;

public class foreach2 {
	public static void main(String[] args) {
		int a[]= {1,3,2,5,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			System.out.println(a[i]+" "+a[j]);
		}
	}
	}
}

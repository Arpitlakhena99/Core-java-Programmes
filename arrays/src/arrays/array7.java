package arrays;

public class array7 {
public static void main(String[]args)
{
	int[] arr=new int[5];
	int ele=10;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=ele;
		ele=ele+10;
		
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}

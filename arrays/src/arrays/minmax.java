package arrays;

public class minmax {
	public static void main(String[]args)
	{
		int[]arr= {8,12,23,43,11};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(max-min);
	}

}

package arrays;

public class Randnum {
	public static void main(String[]args)
	{
		String[] arr= {"red","black","rgb","green"};
		int n=(int)(Math.random()*arr.length);
		System.out.println(arr[n]);
		
	}

}

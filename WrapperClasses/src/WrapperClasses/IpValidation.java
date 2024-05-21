package WrapperClasses;

public class IpValidation {
	public static void main(String[] args) {
		boolean flag=true;
		String s="123.45.34.165";
		String[] arr=s.split("[.]");
		if(arr.length==4)
		{
			for(String ele:arr)
			{
				int n=Integer.parseInt(ele);
				if(n<0||n>255)
				{
					flag=false;
					break;
				}
			}
		}
		else {
			flag=false;
		}
		System.out.println(flag==true?"valid":"invalid");
	}

}

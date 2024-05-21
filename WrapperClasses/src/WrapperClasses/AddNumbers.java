package WrapperClasses;

public class AddNumbers {
public static void main(String[] args) {
	String s="hello 100 hi bye 200 welcome 23";
	String[] arr=s.split(" ");
	int sum=0;
	for(String ele:arr)
	{
	try {
	int n=Integer.parseInt(ele);
	sum=sum+n;
	}
	catch(Exception e)
	{
		
	}

    }
    System.out.println(sum);
     }
 }

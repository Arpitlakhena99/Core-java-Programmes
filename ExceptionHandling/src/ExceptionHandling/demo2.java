package ExceptionHandling;
/**
 * how to handle exceptions
 */
public class demo2 {
public static void main(String[] args) {
	System.out.println("main started");
	int x=100;
	int y=0;
	int res=0;
	try
	{
		System.out.println("started");
		res=x/y;
		System.out.println("ended");
	}
	catch(ArithmeticException exp)
	{
		System.out.println("runnig");
	}
	System.out.println("x value "+x);
	System.out.println("y value "+y);
	System.out.println("res value "+res);
}
}

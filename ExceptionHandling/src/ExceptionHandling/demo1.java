package ExceptionHandling;

public class demo1 {
public static void main(String[] args) {
	System.out.println("main method started");
	int x=10;
	int y=5;
	int res=0;
	
	res=x/y;
	if(res<5)
	{
		System.exit(0);
		
	}
	System.out.println("x value is "+x);
	System.out.println("y value is "+y);
	System.out.println("res value is "+res);

	System.out.println("main method ");
}	

}
package ExceptionHandling;

public class calculatorclass {
public void divide(int numerator,int denominator)
{
	int res=0;
	try {
		res=numerator/denominator;
	}
	catch(ArithmeticException exp){
		//alternative code
		System.out.println("denominator shoulb be non-zero");
		System.out.println("dividing by 1");
	denominator=1;
	res=numerator/denominator;
	}
	System.out.println("Result of "+numerator+"/"+denominator+" is "+res);
}
}
 
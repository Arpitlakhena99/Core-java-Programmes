package ExceptionHandling;
import java.util.Scanner;
public class calculator{
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner ip=new Scanner(System.in);
		calculatorclass c1=new calculatorclass();
		System.out.println("Enter numerator value");
		int n=ip.nextInt();
		System.out.println("Enter Denomiator Value");
		int m=ip.nextInt();
		c1.divide(n,m);
		System.out.println(5/0);
		System.out.println("main method ended");
	}

}

package string;
import java.util.Scanner;

public class demo {
	public static void main(String[]args)
	{
		String regUsrName=new String ("manager");
		String regPassword=new String ("admin@123");
Scanner scn1=new Scanner(System.in);
System.out.println("enter user name");
String enteredUsrName=scn1.next();
System.out.println("enter password");
String enteredpassword=scn1.next();
	if(regUsrName.equals(enteredUsrName) && regPassword.equals(enteredpassword)
			)
	{
		System.out.println("login success");
	}
	else
	{
		System.out.println("login failed");
	}
}
}
package app;
import java.util.Scanner;
import serviceimpln.RentalServiceImpln;
import service.RentalService;
public class RentalApp {
	public static void main(String[] args) {
		System.out.println("======Welcome to Oyo Rooms=======");
		Scanner ip = new Scanner(System.in);
		RentalService r1= new RentalServiceImpln();
		while(true)
		{
			System.out.println("=====Menu=====");
			System.out.println("1.Info\n2.Rooms Available\n3.CheckIn\n4.Customer Details");
			System.out.println("5.CheckOut\n6.Exit");
			System.out.println("Enter your Option:-");
			int op = ip.nextInt();
			switch(op)
			{
			case 1:r1.info();break;
			case 2:r1.RoomsAvailable();break;
			case 3:r1.CheckIn();break;
			case 4:r1.customerDetails();break;
			case 5:r1.checkOut();break;
			case 6:System.out.println("-----Thankyou Visit Again-----");
			System.exit(0);
			default:System.out.println("Invalid option:-");
			}
		}
	}
}

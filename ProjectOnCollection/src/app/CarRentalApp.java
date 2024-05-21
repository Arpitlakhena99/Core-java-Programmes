package app;
import java.util.Scanner;
import serviceimpln.CarRentalServiceImpln;
public class CarRentalApp {
	
	public static void main(String[] args) {
		System.out.println("====>Welcome to Car Rental System<====");
		Scanner ip =new Scanner(System.in);
		CarRentalServiceImpln c1= new CarRentalServiceImpln();
		while(true) {
			System.out.println("===>Menu<===");
			System.out.println("1.Add Car\n2.All Details\n3.Find Car By Id");
			System.out.println("4.Sortetails\n5.By price\n6.By Fuel Type\n7.Exit");
			int op=ip.nextInt();
			switch(op)
			{
			case 1:c1.addCar();break;
			case 2:c1.allDetails();break;
			case 3:c1.findCarById();break;
			case 4:c1.sortCarByCid();
			case 5:c1.sortCarByPrice();
			case 6:c1.sortCarByFuelType();
			case 7:System.out.println("==>Thankyou Visit Again<==");
			System.exit(0);break;
			default:System.out.println("Invalid option...!!");
			}
		}
	}

}


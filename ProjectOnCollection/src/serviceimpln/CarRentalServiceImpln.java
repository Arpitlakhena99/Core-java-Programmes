package serviceimpln;
import service.CarRentalService;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import entity.Car;
public class CarRentalServiceImpln implements CarRentalService {
    ArrayList<Car> l1 = new ArrayList<Car>();
    Scanner ip = new Scanner(System.in);
	@Override
	public void addCar() {
	// TODO Auto-generated method stub	
	System.out.println("==>Please enter below Car Details");
	System.out.println("Enter the car id:-");
	int cid=ip.nextInt();
		System.out.println("Enter the brand Name:-");
		String bname=ip.next();
		System.out.println("Enter the color:-");
		String color=ip.next();
		System.out.println("Enter the price:-");
		double price=ip.nextInt();
		System.out.println("Enter the fuel Type:-");
		String ft=ip.next();
		System.out.println("Enter the model:-");
		int model=ip.nextInt();
		System.out.println("Enter the milage");
		int milage=ip.nextInt();
		l1.add(new Car(cid,bname,color,price,ft,model,milage));
		System.out.println("===Details Has Been Saved...!===");
	}
	@Override
	public void allDetails() {
		// TODO Auto-generated method stub
		int c=0;
		for(Car ele :l1)
		{
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("No Data Found..!!!");
	}
}
public void findCarById() {
		// TODO Auto-generated method stub
	System.out.println("Please Enter The car id ");
	int ci=ip.nextInt();
	int c=0;
	for(Car c1 :l1)
	{
		if(c1.getCid()==ci)
		{
			System.out.println(c1);
			c++;
			break;
		}
	}
	if(c==0)
	{
		System.out.println("Id Not Found...!!!!");
	}
	}
@Override
public void sortCarByCid() {
	// TODO Auto-generated method stub
	Collections.sort(l1);
	System.out.println("========Car Details=========");
	int c=0;
	for(Car ele:l1)
	{
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("No Data Found..!!!");
	}
}
@Override
public void sortCarByFuelType() {
	// TODO Auto-generated method stub
//	Collections.sort(l1,new sortByFuelType());
//	System.out.println("=====Car Details=====");
	Collections.sort(l1, new SortByPrice());
    System.out.println("===Cars Sorted By Price===");
    int c = 0;
    for (Car car : l1) {
        System.out.println(car);
        c++;
    }
    if (c == 0) {
        System.out.println("No Data Found!!!");
        }
}
@Override
public void sortCarByPrice() {
	// TODO Auto-generated method stub
//	System.out.println("===Car By Price");
	 Collections.sort(l1, new SortByPrice());
     System.out.println("===Cars Sorted By Price===");
     int c = 0;
     for (Car car : l1) {
         System.out.println(car);
         c++;
     }
     if (c == 0) {
         System.out.println("No Data Found!!!");
}
}
}
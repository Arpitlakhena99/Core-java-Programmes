package serviceimpln;
import java.util.LinkedHashMap;

import java.util.Scanner;
import entity.Customer;
import entity.address;
import service.RentalService;
public class RentalServiceImpln implements RentalService 
{
	Scanner Ip =new Scanner(System.in);
	{
		for(int i=101;i<=108;i++)
		{
			nac.put(i, null);
		}
		for(int i=201;i<=205;i++)
		{
			ac.put(i, null);
		}
		for(int i=301;i<=304;i++)
		{
			deluxe.put(i, null);
		}
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("=========Room Details=========");
		System.out.println("------Non-Ac-----");
		System.out.println("Bed");
		System.out.println("Fan");
		System.out.println("1500");
		System.out.println("2 Memebers are limited");

		System.out.println("-----AC-----");
		System.out.println("Ac");
		System.out.println("WiFi");
		System.out.println("Tv");
		System.out.println("2 Members");
		System.out.println("Price :2500");

		System.out.println("-------Deluxe-------");
		System.out.println("Ac");
		System.out.println("WiFi");
		System.out.println("Tv");
		System.out.println("Fridge");
		System.out.println("3 to 4 members");
		System.out.println("price :3000");
	}
	@Override
	public void CheckRooms(LinkedHashMap<Integer,Customer> m, String type) {
		System.out.println("---------"+type+" Rooms:-----------");
		int c=0;
		for(Integer roomno:m.keySet())
		{
			if(m.get(roomno)==null)
			{
				System.out.print(roomno+" ");
				c++;
			}
		}
		// TODO Auto-generated method stub
		System.out.println();
		if(c==0)
		{
			if(c==0)
			{
				System.out.println("No Rooms Available....!!!");
			}
		}

	}
	@Override
	public void RoomsAvailable() {
		// TODO Auto-generated method stub
		CheckRooms(nac,"Non Ac");
		CheckRooms(ac,"Ac");
		CheckRooms(deluxe,"Deluxe");
	}
	void allocate(LinkedHashMap<Integer,Customer> m,String roomType,double price)
	{
		System.out.println("Enter the Room No:-");
		int roomno=Ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)==null)
		{
			System.out.println("Enter Customer Id:- ");
			int cid=Ip.nextInt();
			System.out.println("Enter Customer Name:-");
			String cname=Ip.next();
			System.out.println("Enter Customer Phno;-");
			long cphno=Ip.nextLong();
			System.out.println("Enter customer House No:-");
			String houseno=Ip.next();
			System.out.println("Enter Street Name:-");
			String sname=Ip.next();
			System.out.println("Enter Pin Code:-");
			int pcd=Ip.nextInt();
			Customer c = new Customer(cid, cname, cphno, new address(houseno, cname, houseno, sname, pcd), sname, roomno, roomno);
			m.put(roomno, c);
			l1.add(c);
			System.out.println(c.getCname() +" had been allocate for " +roomType+"roomno: "+roomno);
			System.out.println(c.getCname()+" need to pay Rs "+price );
			
		}
	}
	@Override
	public void CheckIn() {
		// TODO Auto-generated method stub
		System.out.println("---------Check In------------------");
		System.out.println(" 1.Non-Ac\n2.Ac\n3.Deluxe ");
		System.out.println(" Enter the option ");
		int op=Ip.nextInt();
		switch(op)
		{
		case 1:allocate(nac,"Non Ac",2000);break;
		case 2:allocate(ac,"Ac",2500);break;
		case 3:allocate(deluxe,"Deluxe",3000);break;
		default:System.out.println("----Invalid Option-----");
		}
	}
	void deAllocate(LinkedHashMap<Integer,Customer>m)
	{
		System.out.println("Enter Room No:-");
		int roomno=Ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)!=null)
		{
			Customer c=m.get(roomno);
			System.out.println(c.getCname()+" Thnaks for Visiting Our Hotel..!!");
			m.put(roomno,null);
		}
		else
		{
			System.out.println("Invalid Rooms...!!!");
		}
		
	}
	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("---------Check In------------------");
		System.out.println("1.Non-Ac\n2.Ac\n3.Deluxe");
		System.out.println("Enter the option");
		int op=Ip.nextInt();
		switch(op)
		{
		case 1:deAllocate(nac);break;
		case 2:deAllocate(ac);break;
		case 3:deAllocate(deluxe);break;
		default:System.out.println("----Invalid Option-----");
		}
	}
	@Override
	public void customerDetails() {
		// TODO Auto-generated method stub
		int c=0;
		System.out.println("-------Customer Details---------");
		for(Customer ele:l1) {
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("No Customer Data Found...!!!");
	}	

	}
}

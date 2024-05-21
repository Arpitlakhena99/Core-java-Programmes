package practice;

public class Laptop {
	String name,brand;
	int price;
	Laptop(String name,String brand,int price)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		
	}
	public static void main(String[] args) {
		Laptop L1= new Laptop("Hp","pavilion",300000);
		System.out.println(L1.name);
		System.out.println(L1.brand);
		System.out.println(L1.price);
		System.out.println(  " ");
		Laptop L2= new Laptop("Asus","insprion",200000);
		System.out.println(L2.name);																																																																																																																																																																																																																																																																																																																																																																																																													
		System.out.println(L2.brand);
		System.out.println(L2.price);
		System.out.println(  " ");
		
		Laptop L3= new Laptop("dell","legin",400000);
		System.out.println(L3.name);
		System.out.println(L3.brand);
		System.out.println(L3.price);
		System.out.println(  " ");

	}

}

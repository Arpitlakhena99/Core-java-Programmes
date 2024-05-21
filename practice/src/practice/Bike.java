package practice;

public class Bike {
 String name,color;
 int price;
 Bike(String name,String color,int price){
	 this.name=name;
	 this.color=color;
	 this.price=price;
 }
 public static void main(String[] args) {
	Bike B1= new Bike("z900","black",780000)	;
	System.out.println(B1.name);
	System.out.println(B1.color);
	System.out.println(B1.price);
	System.out.println(  " ");
	Bike B2= new Bike("hayabusa","white",9877777);
	System.out.println(B2.name);
	System.out.println(B2.color);
	System.out.println(B2.price);
	
	}

}

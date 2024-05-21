package programming;

public class laptop {
    //initialize the property using object reference
String brand;
String color;
int price;

static{
    laptop l1=new laptop();
    l1.brand="hp";l1.color="black";l1.price=35000;

    System.out.println(l1.brand);
    System.out.println(l1.color);
    System.out.println(l1.price);

    laptop l2=new laptop();
    l2.brand="dell";l2.color="blue";l2.price=38000;

    System.out.println(l2.brand);
    System.out.println(l2.color);
    System.out.println(l2.price);
}
public static void main(String[]args)
{
  System.out.println("------"); 
}


}
    

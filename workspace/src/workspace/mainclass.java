package workspace;

public class mainclass {
public static void main(String [] args)
{
	demo1 da=new demo1();
	demo1 d1=new demo2();
	demo2 d2= (demo2)d1;
//	System.out.println(da instanceof demo1);
//	System.out.println(d1 instanceof demo1);
	System.out.println(da instanceof demo2);
	System.out.println(d2 instanceof demo1);
	System.out.println(d2 instanceof demo2);
}
}

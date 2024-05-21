package array;

public class arrayloop {
	public static void main(String []args)
	{
		demo1 []d1=new demo1[5];
		d1[0]=new demo1();
		d1[1]=new demo1();
		d1[2]=new demo1();
		d1[3]=new demo1();
		d1[4]=new demo1();
		
		System.out.println("total size :"+d1.length);
		
		for(int i=0;i<d1.length;i++)
		{
			System.out.println(d1[i]);
		}
		System.out.println("------------------------");
		for(demo1 obj : d1)
		{
			System.out.println(obj);
		}
	}
}

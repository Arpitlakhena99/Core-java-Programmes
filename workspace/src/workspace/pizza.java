package workspace;

public class pizza {
	String type="regular";
	int price=150;
	int toping1;
	int toping2;
	boolean cheese;
	pizza (boolean c)
	{
		this.cheese=c;
		if(c==true)
		{
			this.price=this.price+40;
		}
	
	}
	public pizza(int t1, boolean cheese, boolean c) {
		this.toping1 = t1;
		this.cheese = cheese;
		this.price=this.price+40;
		if(c==true)
		{
		this.price=this.price+80;	
		}
	}
	public pizza(int t1, int  t2, boolean c) {
		
		this.toping1 = t1;
		this.toping2 = t2;
		this.cheese = c;
		this.price=this.price+70;
		if(c==true)
		{
		this.price=this.price+80;	
		}
	}
	void bill()
	{
		System.out.println("type of pizza= "+this.type);
		System.out.println("toping1="+this.toping1);
		System.out.println("toping2="+this.toping2);
		System.out.println("cheese="+this.cheese);
		System.out.println("price="+this.price);
		float gst=this.price*0.10f;
		float total=this.price+gst;
		System.out.println("gst"+gst);
	System.out.println("price"+price);
	System.out.println();
	}
	public static void main(String []args)
	{
		pizza p1 = new pizza(true);
		p1.bill();
		pizza p2 = new pizza (false);
		p2.bill();
	}
	
}

	
	
	
		
	

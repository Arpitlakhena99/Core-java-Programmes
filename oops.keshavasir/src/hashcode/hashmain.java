package hashcode;

public class hashmain {
	public  static void main(String[]args)
	{
		hash h=new hash();
		hash h1=new hash();
		hash h2=new hash();
		hash h3=new hash();
		int a=h.hashCode();
		int b=h1.hashCode();
		int c=h2.hashCode();
		
		boolean s=h.equals(h3);
		System.out.println(h.hashCode());
		
	}

}

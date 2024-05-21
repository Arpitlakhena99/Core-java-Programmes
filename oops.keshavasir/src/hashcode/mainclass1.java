package hashcode;

public class mainclass1 {
	public static void main (String []args)
	{
		System.out.println("start main method");
		Object o1=new Object();
		Object o2=new Object();
		int n1=o1.hashCode();
		int n2=o2.hashCode();
		System.out.println("hash value"+n1);
		System.out.println("hash value"+n2);
		System.out.println("main  ended9");
	}
}


package strings;

public class string7 {
	public static void main(String[]args)
	{
		String s1="test";
		String s2="test";
		int n1 =s1.hashCode();
		int n2=s2.hashCode();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("-----------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-----------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}

}

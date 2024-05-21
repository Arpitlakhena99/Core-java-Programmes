package strings;
//string class is immutable and its object are also immutable
public class string8 {
	public static void main(String[]args)
	{
		String s1=new String("developer");
		System.out.println(s1);
		System.out.println("-----------0");
		
		s1=new String("programmer");
		System.out.println(s1);
		
		System.out.println("####################");
		String s2="software";
		System.out.println("s2--->"+s2);
		s2="application";
		System.out.println("s2---->"+s2);
	}
}

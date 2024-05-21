package strings;
/**
* string 1-1abcrt16
*o/p- weak

*string 2- 7f4d5hsre
*o/p strong 

*explanation- if a given string contains alphabets in continuity ex-abc it is a small 
*if a given string contains alphabets in non continuity7f4d5hsre strong
*/
//public class string20 {
//	public static void main(String []args)
//	{
//		String s1="7f4d5hsre";
//		boolean flag=true;
//		for(dint i=0;i<s1.length()-2;i++)
//		{
//			char c=s1.charAt(i);
//			if(s1.charAt(i+1)==c+1 && s1.charAt(i+2)==c+2)
//			{
//				flag=false;
//				
//			}
//		}
//		System.out.println(flag);
//	}
//
//}
public class string20 {
	public static void main(String []args)
	{
		String s1="7f4d5hsre";
		boolean flag=false;
		for(int i=0;i<s1.length()-2;i++)
		{
			char c=s1.charAt(i);
			if(s1.charAt(i+1)==c+1 && s1.charAt(i+2)==c+2)
			{
				
				flag=true;
				break;
				
			}
		}
		if(flag==true)
		{
			System.out.println("weak string");
		}
		else {
		System.out.println("strong string");
	}

}
}
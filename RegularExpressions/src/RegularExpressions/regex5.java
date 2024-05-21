package RegularExpressions;
import java.util.regex.*;
public class regex5 {
		//special character or not
		public static void main(String[] args) {
//			String s="#Applez";
//			Pattern p=Pattern.compile("[^A,z ,^a,z,^0-9].*");
//			Matcher m=p.matcher(s);
//			boolean b=m.matches();
//			System.out.println(b);
//			String s="0978534323";
//			System.out.println(Pattern.matches("[6-9]{1}[0-9]{9}", s));
			String s="arpit0000234@gmail.com";
			System.out.println(Pattern.matches("[a-z,A-Z]{3-5}[#].*[0-9]{2-4}[a-z,A-Z]{10})", s));
		
	}


}

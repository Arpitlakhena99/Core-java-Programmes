package RegularExpressions;
import java.util.regex.*;
public class RegexDemo {
	//alphabets or not
	public static void main(String[] args) {
		String s="Applez";
		Pattern p=Pattern.compile("[A,z ,a,z].*");
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		System.out.println(b);
	}
}

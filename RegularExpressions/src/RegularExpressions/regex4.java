package RegularExpressions;
import java.util.regex.*;
public class regex4 {
	//alphanumeric or not
	public static void main(String[] args) {
		String s="Appl1@ez";
		Pattern p=Pattern.compile("[A-Z,a-z,0-9].*");
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		System.out.println(b);
	}
}

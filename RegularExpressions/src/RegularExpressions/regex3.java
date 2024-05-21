package RegularExpressions;
import java.util.regex.*;
public class regex3 {
	//containing  A OR NOT
	public static void main(String[] args) {
		String s="Applez";
		Pattern p=Pattern.compile("A.*");
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		System.out.println(b);
	}
}

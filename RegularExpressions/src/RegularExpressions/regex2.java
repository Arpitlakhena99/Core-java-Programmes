package RegularExpressions;
import java.util.regex.*;
public class regex2 {
	//starts with a or not
	public static
	void main(String[] args) {
		String s="Applez";
		Pattern p=Pattern.compile("[A,a].*");
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		System.out.println(b);
	}
}

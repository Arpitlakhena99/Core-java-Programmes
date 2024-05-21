//string  palindrome
package strings;
public class string11{
	public static void main(String []args)
	{
String s="level";
	String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}















//package strings;
//import java.util.Scanner;
//
//public class string11 {
//	    public static void main(String[] args) {
//	 Scanner ip = new Scanner(System.in);
//	 
//	  System.out.print("Enter a string: ");
//	    String str = ip.nextLine();
//
//	  int length = str.length();
//	   boolean isPalindrome = true;
//	   
//	     for (int i = 0; i < length / 2; i++) {
//	     if (str.charAt(i) != str.charAt(length- i-1)) {
//	     isPalindrome = false;
//	     break;
//	      }
//	    }
//	System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
//
//	    }
//	}
//

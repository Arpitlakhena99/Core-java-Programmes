package strings;

public class string21 {
public class StringTransformation {
public static void main(String[] args) {
	 String a = "ty08dp&uih&y";
	 String b = "";
	 for (int i = a.length()-1; i >= 0; i--) {
	   char c = a.charAt(i);
	    if (Character.isLetter(c) || Character.isDigit(c)) {

	    b = String.valueOf(c) + b;
	    } else
	       {      
	    	b = c + b;
	         }
	        
	}
	  System.out.println("Input String: " + a);
	 System.out.println("Output String: " + b);
	    }
	}

}
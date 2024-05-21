//sorting of given strings
package strings;

public class string2 {
	  public static void main(String[] args) {
	   String S = "aadGXD33@@$%";
	  int a= 0;
	  int n= 0;
	  int s= 0;

	 for (char character : S.toCharArray()) {
	        if (Character.isLetter(character)) {
	        a++;
           } 
	        else if (Character.isDigit(character)) {
	     n++;
	     } else {
	        s++;
	     }
	   }
	System.out.println("Number of Alphabets: " + a);
	System.out.println("Number of Numeric Characters: " + n);
	System.out.println("Number of Special Characters: " + s);
  
}
}


//character case manipulation
package strings;
public class string13 {
  public static void main(String[] args) {

    String s= "ab12pd@08HK";
    String res= "";
     for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c >= 'a' && c <= 'z') {
        res += (char) 
        (c - 'a' + 'A');
        } 
        else if (c >= 'A' && c <= 'Z') {
         res+= (char) 
	   (c - 'A' + 'a');
         } 
       else {
        res+= c;
         }
     }
     System.out.println("Converted String: " + res);
     }
	}

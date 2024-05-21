package splitsplit;

public class IpadressValidation {
public static void main(String[] args) {
	String ip1="123.43.78.256";
	String[] s1=ip1.split("\\.");

	  if(s1.length!=4) {
	  System.out.println("invalid");
	  return;
	     }
	 for(String seg:s1) {
	 if(seg.isEmpty()||seg.length()>3){
	 return;
	       }
	 for(char c:seg.toCharArray()){
	  if(!Character.isDigit(c)) {
	   System.out.println("invalid");
	     return;
	          }
	        }
	   int value=0;
	   for(int i=0;i<seg.length();i++) {
	   value=value*10+(seg.charAt(i)-'0');
	        }
	   if(value<0||value>255){
	   System.out.println("invalid");
	    return;
	      }
	     }
	  System.out.println("valid");
	 }
}
package splitsplit;
public class BinaryToNumber {
 public static void main(String[] args) {
	        System.out.print("Enter a binary number: ");
	        String bi="1111";
	        int n=0;
	        int pow=1;
	        for (int i=bi.length()-1;i>=0;i--) {
	            int digit=bi.charAt(i)-'0';
	            n+= digit*pow;
	            pow*=2; 
	        }
	        System.out.println("Decimal representation: "+n);
	    }
	}
package strings;

public class string10 {
	    public static void main(String[] args) {
	        String s= "ab12pd@081";
	        int sum = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c >= '0' && c <= '9') {
	                sum += (c-'0');
	            }
	        }
	        System.out.println("Sum of numeric values: " + sum);
	    }
	}

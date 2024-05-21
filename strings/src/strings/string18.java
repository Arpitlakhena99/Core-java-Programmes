package strings;

public class string18 {
	    public static void main(String[] args) {
	        String s="12";
	        int result=ToNumber(s);
	        System.out.println(result);
	    }
	    private static int ToNumber(String str) {
	        int n = 0;
	        for (int i=0;i<str.length();i++) {
	            char Char=str.charAt(i);
	            int digit=Character.getNumericValue(Char);
	            n=n*10+digit;
	        }
	        return n;
	    }
	}


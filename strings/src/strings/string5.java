package strings;

public class string5 {
	    public static void main(String[] args) {
	        String s = "gf54#2dsMng&89";
	        char[] charArray = s.toCharArray();
	        for (int i = 0; i < charArray.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < charArray.length; j++) {
	                if (charArray[j] < charArray[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            if (minIndex != i) {
	                char temp = charArray[i];
	                charArray[i] = charArray[minIndex];
	                charArray[minIndex] = temp;
	            }
	        }
	        String result = new String(charArray);
 
	        System.out.println(result);
	    }
	
	}


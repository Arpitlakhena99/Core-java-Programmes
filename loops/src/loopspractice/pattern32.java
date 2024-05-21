package loopspractice;

public class pattern32 {
public static void main(String[] args) {
	   String s = "aaaaabbggccddjjjj";
	   int[] arr= new int[128];
	      for (int i = 0; i < s.length(); i++) {
	        char C = s.charAt(i);
	         arr[C]++;
	        }
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > 0) {
	                System.out.println((char) i + "--->" +arr[i]);
	            }
	        }
	    }
	}
package loopspractice;

public class pattern7 {
	   static int n=100; 
	        public static void nrange(int n) {
	            if (n >= 1) {
	                nrange(n - 1);
	                System.out.println(n);
	            }
	        }
	        public static void main(String[] args) {
	            nrange(n);
	        }
	    }


package loopspractice;

public class pattern14 {

	// 10101
	// 01010
	// 10101
	// 01010
	// 10101

	        public static void main(String[] args) {
	            int n = 5;
	            for (int i = 0; i < n; i++) {
	                System.out.println((i % 2 == 0) ? "10101" : "01010");
	            }
	        }
	    }

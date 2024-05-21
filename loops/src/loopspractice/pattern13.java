package loopspractice;

public class pattern13 {
	// 2 3 4 5 6
	// 3 4 5 6 7
	// 4 5 6 7 8
	// 5 6 7 8 9
	// 6 7 8 9 10
	        public static void main(String[] args) {
	            int rows = 5;
	            int cols = 5;
	            int start = 2;
	            for (int i = 0; i < rows; i++) {
	                int num = start + i;
	                for (int j = 0; j < cols; j++) {
	                    System.out.print(num + " ");
	                    num++;
	                }
	                System.out.println();
	            }
	        }
	    }

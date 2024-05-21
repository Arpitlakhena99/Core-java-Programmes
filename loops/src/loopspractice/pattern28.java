package loopspractice;

public class pattern28 {
 public static void main(String[] args) {
	 int h = 8;
	 for (int i = 0; i < h; i++) {
	 for (int j = 0; j <= h + 1; j++) {
	 if (j == 0 || j == h+ 1 || (j == i + 1 && j <= h/ 2 + 1) || (j == h-i && j > h/ 2 + 1)) {
	 System.out.print("*");
	    } 
	 else {
	 System.out.print(" ");
	        }
	  }
     System.out.println();
	   }
	    }
	}


package loopspractice;

public class pattern30 {
public static void main(String[] args) {
	 int n = 5; // Number of rows

	 for (int i = 0; i < n; i++) {
     for (int j = 0; j <= i; j++) {
     if (j % 2 == 0) {
    System.out.print("1 ");
	        }
        else {
    System.out.print("0 ");
  	     }
     }  
	System.out.print("6\n");
	        }
	    }
	}
package loopspractice;

public class pattern29 {
	    public static void main(String[] args) {
	        int height = 8; // Set the height of the pattern

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j <= height; j++) {
	                if ((i + j == height / 2) || (j - i == height / 2) || (i == height / 2) || (i == height - 1 && j > 0 && j < height)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


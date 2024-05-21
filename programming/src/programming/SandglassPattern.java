package programming;

	import java.util.Scanner;

	public class SandglassPattern {
	    public static void main(String[] args) {
	        int i, j, k, n;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of rows");
	        n = sc.nextInt();

	        for (i = 0; i < n; i++) {
	            for (j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (k = i; k < n; k++) {
	                System.out.print("*" + " ");
	            }
	            System.out.println();
	        }

	        for (i = 2; i <= n; i++) {
	            for (j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            
	            for (k = 0; k < i; k++) {
	                System.out.print("*" + " ");
	            }
	            System.out.println();
	        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	    }
	}

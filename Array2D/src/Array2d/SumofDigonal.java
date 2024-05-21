package Array2d;
import java.util.Scanner;
public class SumofDigonal {
 public static void main(String[] args) {
	 int[][] arr= new int[3][3];
	 Scanner ip= new Scanner(System.in);

	  System.out.println("Enter values for a 3x3 array:");
	  for(int i=0;i<3;i++){
	    for(int j=0;j<3;j++){
	    System.out.print("Enter value for position ("+i+","+j+"):");
	    arr[i][j]=ip.nextInt();
	            }
	        }
	        System.out.println("\nPrinting 3x3 array:");
	        for(int i=0;i<3;i++){
	          for (int j=0;j<3;j++) {
	          System.out.print(arr[i][j] +" ");
	            }
	            System.out.println();
	        }
	        int diagonalSum=0;
	        for (int i=0;i<3;i++) {
	            diagonalSum+=arr[i][i];
	        }
	        System.out.println("\nSum of diagonal elements: " + diagonalSum);
	    }
	}
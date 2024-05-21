package arrays;
import java.util.Scanner;
public class MaxValue {

	  public static void main(String args[]) {
	    int arr[] = {8,6,87,41,4};  
	      int max;
	        max = arr[0]; 
	        for (int i = 1; i < arr.length; i++) {
	            if (max < arr[i]) {
	                max = arr[i]; 
	            }
	        }
	        System.out.println("\nThe largest (MAX) element is: " + max);
	    }
	}
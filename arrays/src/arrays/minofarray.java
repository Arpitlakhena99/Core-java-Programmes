package arrays;

public class minofarray {
	    public static void main(String args[]) {
	        int arr[] = {8, 6, 87, 41, 4};  

	        int min = arr[0]; 

	        for (int i = 1; i < arr.length; i++) {  
	            if (min > arr[i]) { 
	                min = arr[i]; 
	            }
	        }

	        System.out.println("\nThe smallest (MIN) element is: " + min);  // Print the minimum value
	    }
	}
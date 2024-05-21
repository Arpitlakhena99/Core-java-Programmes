package arrays;
import java.util.Scanner;
public class Sumofarray {
	
	    public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        System.out.println("enter size:");
	        int size = ip.nextInt();
	        System.out.println("Array Elements:");

	        int[] arr = new int[size];

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = ip.nextInt();
	        }
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Array Element:"+arr[i]);
	        }

	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        System.out.println("Sum of Array Elements: " + sum);

	    }

	}
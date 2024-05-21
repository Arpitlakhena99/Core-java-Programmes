package foreachloop;

public class foreach {
public static void main(String[] args) {
	int[] arr = {10, 20, 30, 40, 50};
	int sum = 0;
	int max = arr[0]; 
	int min = arr[0]; 
	
	
    for (int num : arr) {
	sum += num;
    
	 if (num > max) {
	max = num;
	}
   
	if (num < min) {
	min = num;
	  }
	 }
     // Print the result
	 System.out.println("Sum of Elements: " + sum);
	 System.out.println("Maximum Element: " + max);
	 System.out.println("Minimum Element: " + min);
	    }
	}

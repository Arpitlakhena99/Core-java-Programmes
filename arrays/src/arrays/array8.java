package arrays;

public class array8 {
	    public static void main(String[] args) {
	        int[] nums = {1, 2,2,13, 1}; 

	        int total = 0;
	        if(nums.length!=0) {
	        	for (int i = 0; i < nums.length; i++) {
		            if (nums[i] == 13) {
		                i += 1; 
		            } else {
		                total += nums[i];
		            }
		        }

		        System.out.println("The sum of the numbers is: " + total);
	        }
	        else {
	        	System.out.println(0);
	        }
	        
	    }
	}


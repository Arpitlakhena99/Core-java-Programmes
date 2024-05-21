package arrays;

public class array9 {
	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 2};  
	        int[] nums2 = {1, 2, 2, 6, 99, 99, 7}; 
	        int[] nums3 = {1, 1, 6, 7, 2,4,6,5,3,7,1}; 

	        System.out.println("nums13 → " + sum67(nums1));
	        System.out.println("nums2 → " + sum67(nums2));
	        System.out.println("nums3 → " + sum67(nums3));
	    }
	    public static int sum67(int[] nums) {
	        int total = 0;
	        boolean skip = false;
	        for (int num : nums) {
	            if (num == 6) {
	                skip = true;
	            } else if (skip && num == 7) {
	                skip = false;
	            } else if (!skip) {
	                total += num;
	            }
	        }
	        return total;
	    }
	}
package datastructuresalgorithm;
//method2
public class BinarySearch{
	static int search(int []arr,int key)
	{
		int l=0,h=arr.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==key)
			{
				return mid;
		}
			else if(key>arr[mid])
			{
				l=mid+1;
			}
			else {
			h=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		   int[] arr = {43, 4, 5, 1, 2, 8, 25};
					System.out.println(search(arr,8));
	}
}
//public class BinarySearch {
// public static void main(String[] args){
//	   int[]arr={2,3,4,10,40};
//	    int n=10;
//	    int l=0;
//	    int r=arr.length-1;
//	        int mid=0;
//	        while(l<=r) {
//	            mid=(l+r)/2;
//	            if(arr[mid]==n) {
//	             System.out.println("Element found at index "+mid);
//	             break;
//	            }
//	            if(arr[mid]<n){
//	            l=mid+1;
//	            }
//	            else{
//	            r=mid-1;
//	            }
//	        }
//	        if(l>r) {
//	     System.out.println("Element not present in array");
//	   }
//	}
// }
